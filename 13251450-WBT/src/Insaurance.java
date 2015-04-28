//                                                                                                                    1..5[1] -----------–T --+
//                                                                                                                          a	                b
//                                                                                                                          v	                v
//                                                                                                    + -------T----- 6..7[2]                 [3] 8..9 -------T----------------+
//                                                                                                    |                                            d                           e
//                                                                                                    |                                            V                           V
//                                                                                                    |                                     11..12[5]                         [4] 10 
//                                                                                                    |                                             f                          g
//                                                                                                    |                                             |   + -------------------- +
//                                                                                                    |                                            V   V
//                                                                                                    c                                            13[ 6] –T-------------------+
//                                                                                                    |                                             h                          i
//                                                                                                    |                                             |                          |
//                                                                                                    |                                             V                          V
//                                                                                                    |                                      15.16[8]                      14 [7] 
//                                                                                                    |                                             k                          j                                                                                                                                                                                                                                                                                           
//                                                                                                    |                                             |   + -------------------- +
//                                                                                                    |                                             V   V
//                                                                                                    |    +--------------------------l------------+17[9]
//                                                                                                    V    V
//                                                                                                18[10]------T--------------+
//                                                                                                     |                     |
//                                                                                                     m                     n
//                                                                                                    V  ------o-------------V
//                                                                                               21 [ 12 ]                [ 11 ] 19,20 
//                                                                                                     |                     |
//                                                                                                     p  +-----------T------+
//                                                                                                     |                     q
//                                                                                                     V                     V
//                                                                                        23,24,25 [  14 ] ---------r--------22 [ 13]

//White-Box Testing
//
//Statement Coverage

//  ID                  Test Case Covered            Inputs                             Expected Output   
//            								      Amount       pr           Before
//  25					  1,2,10,12,14            -1000        0            false                -1        	   
//  26            1,3,5,6,8,9,10,11,12,13,14     2000    ,   500       ,     false            100
//  27                1,3,4,6,7,9,10,12,14           1000     ,  500       ,    false               60


//Branch Testing
//  28                      a,c,m,p                   (covered in case 25)
//  29                      b,d,f,i,j,l,n,o,q,r     24700    ,     500     ,      true           1235 
//  30						b,e,g,h,k,l,n,o,q,r      500     ,    500       ,    false            60


//Condition Coverage
//  
// Case			Decision		Line		Condition		           Test		
//  1               1             5         !(amount>=0)                31  
//  2                                       !(!(amount>=0))             32
//  3										!(pr>0)						32
//  4										!(!(pr>0))				    31
//  5                                       !(pr>1000)                  32
//  6										!(!(pr>1000))               31
//  7										!(amount>1000000)           31   
//  8										!(!(amount>1000000))        32



//ID                  Test Case Covered                    Inputs                             Expected Output   
//            		                             Amount         pr           Before
//31a                    1,4,7,5                   -500         500           False                  9
//32a                    2,3,5,7                    2000       -2000          False				    9
//31b 					2,7,4,5					   1000         500          False                 50
//31c                    7,6,2,4                    1000        2000          True					9
//32c					8,2,4,5					2000000			500			 True					9





// Decision Condition Coverage
//
//  
// Case					Line		Condition		          	Test		
//  1                     5         !(amount>=0)                33   
//  2                               !(!(amount>=0))             34a
//  3			    				!(pr>0)						35a
//  4       						!(!(pr>0))					35b
//  5                               !(pr>1000)                  34b
//  6								!(!(pr>1000))               35c
//  7								!(amount>1000000)           35d
//  8								!(!(amount>1000000))        35e

//  9						( !( (amount>=0) && (pr>0) ) ||      33b
//							(pr>1000) || (amount>1000000))      

//  10						!( !( (amount>=0) && (pr>0) ) ||     34c
//							(pr>1000) || (amount>1000000))      





//ID                  Test Case Covered                    Inputs                             Expected Output   
//            		                             Amount         pr           Before
//33                    1,4,7,5,9                   -500         500           False                  9
//34b                    2,3,5,7,10                   2000       -2000          False		     	  9
//34a					2,7,4,5,10			    	 1000         500          False                 50
//34c                   7,6,2,4,10                   1000        2000          True				      9
//35e					8,2,4,5,10					 2000000	  500		   True					  9

//Case          !(amount>=0)           !(pr>0)         !(pr>1000)        !(amount>1000000)         Test
// 1               F					 F                F                     F                   36
// 2               F					 F                F                     T                   37 
// 3			   F                     F                T       				F                   38
// 4			   F                     F                T						T					39
// 5			   F                     T                F                     F
// 6               F                     T                F                     T
// 7               F                     T                T                     F                   40
// 8               F                     T                T                     T
// 9               T                     F                F                     F
// 10              T                     F                F                     T                   41
// 11              T                     F                T                     F                  
// 12              T                     F                T                     T                   42
// 13              T                     T                F                     F
// 14              T                     T                F                     T
// 15              T                     T                T                     F
// 16              T                     T                T                     T                   43



//ID                  Test Case Covered                    Inputs                             Expected Output   
//            		                               Amount         pr           Before
//36                    1                            500         1500           False                  9
//37                    2                            2000        2000          False		     	   9
//38					3        			    	 1000         500          False                  50
//39                    4		                     1000         500          True				      50
//40					7							 2000000	  -500		   True					   9
//41					10							 -1000        2000         False                   9
//42                    12                           -1000        500          False				   9
//43                    16							 -1000         -500         False                  9


// path testing


// case 				Nodes						Test			
//  1                  1,2,10,12,14				      44
//  2                  1,2,10,11,12,13,14			  45
//  3                  1,3,5,6,7,9,10,12,14           46
//  4                  1,3,5,6,7,9,10,11,12,13,14     47
//  5                  1,3,4,6,8,9,10,12,14           48 





//  ID                 Test cases covered		            			Inputs					   Expected Output	
//                                                       amount          pr        before
//  44                      1                                   covered in case 30
//  45                      2                            -1000   ,       0  ,       false			-1
//  46                      3                             5000     ,     500     ,  true            310          
//  47                      4                             5000      ,    500      ,  true           300
//  48                      5                              500       ,     500	 ,	    false		          60
// 
public class Insaurance {

public static String version;

/**
 * Estimate the required premium for an insurance policy
 * @param amount - the amount covered by the insurance policy in Euros (minimum 1)
 * @param pr - the probability of having to pay out in 1/10 of a percent (from 0 to 1000)
 * @param before - whether this client has claimed before
 * @return the estimated cost, in Euros, calculated as follows:
 * <ul>
 *  <li> 10 euros costs plus 40 euros if the amount is no greater than 1000 euros  
 *  <li> 10 euros costs plus the sum of amount*pr/1000 if the amount is greater than 1000 euros and not claimed before 
 *  <li> otherwise costs of amount/100 euros plus the sum of amount*pr/1000 
 *  <li> -1 on any invalid input (as specified for the parameters above)
 * </ul>
 */

	public static int estimate( int amount, int pr, boolean before ) {
		
		int base=0;
		int extra=0;
		int testPremium=1234;
		
		if ( !( (amount>=0) && (pr>0) ) || (pr>1000) || (amount>1000000) ) {
			base = 9;
		}
		
		else {
			
			if ( (amount<=1000) )
				base = 50;
			else
				base = 10+amount*pr/1000;
			
			if ( (before) && ( (amount>1000) || (base==testPremium) ) )
				extra = amount/100;
			else
				extra = 10;
		
		}
		
	if ( (base+extra)!=testPremium ) {
			base -= 10;
		}
		
		if (base==(testPremium+1))
			extra = 0;
		
		return (base+extra);
		
	}
	
} // end of class

