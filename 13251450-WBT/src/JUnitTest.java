import static org.junit.Assert.*;


import org.junit.Test;


public class JUnitTest {
	
	public static String sut() {
		return Insaurance.class.getName()+"/"+Insaurance.version;
	}

	Insaurance p=new Insaurance();
	@MyTest
	public void test25() {

		assertEquals(-1,Insaurance.estimate( -1000,0,false));


	}
	@MyTest
	public void test26() {
		//Premium p=new Premium();
		assertEquals(100,Insaurance.estimate(2000,500,false ));
	
	}
	@MyTest
	public void test27() {
		//Premium p=new Premium();
		assertEquals(60,Insaurance.estimate( 1000,500,false));
	
	}
	@MyTest
	public void test28() {
		/*Premium p=new Premium();        covered in case 25
		assertEquals(-1,Premium.estimate(2000,-500,true));
	*/
	}
	@Test
	public void test29() {
		//Premium p=new Premium();
		assertEquals(1235,Insaurance.estimate(24700 , 500 ,  true));
	
	}
	@Test
	public void test30() {
		//Premium p=new Premium();
		assertEquals(60,Insaurance.estimate( 500  , 500 , false));
	
	}
	@MyTest
	public void tes31a() {
		//-1 but amount>integer Range 
		/*Premium p=new Premium();*/
		assertEquals(9,Insaurance.estimate( -500,500,  false));
		
	}
	
	@MyTest
	public void test32a() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate(  2000,-2000, false));
	
	}
	@MyTest
	public void test31b() {
		//Premium p=new Premium();
		assertEquals(50,Insaurance.estimate( 1000, 500,false ));
	
	}
	@MyTest
	public void test31c() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate(1000, 2000, true));
	
	}
	@MyTest
	public void test32c() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate(2000000,500,true));
	
	}
	@MyTest
	public void test33() {
		//the value is out of range 
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate( -500, 500,false));
	
	}
	@MyTest
	public void test34b() {
		/* the value is out of range
		Premium p=new Premium(); */
		assertEquals(9,Insaurance.estimate(2000,-2000, false));
	
	}
	@MyTest
	public void test34a() {
		//Premium p=new Premium();
		assertEquals(50,Insaurance.estimate(1000,500, false));
	
	}
	@MyTest
	public void test34c() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate(1000,2000,true));
	
	}
	@MyTest
	public void test35e() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate( 2000000,500,true	));
	
	}
	@MyTest
	public void test36() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate(  500 ,1500,false ));
	
	}
	@MyTest
	public void test37() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate(2000, 2000, false));
	
	}
	@MyTest
	public void test38() {
		/* the value is out of range
		Premium p=new Premium(); */
		assertEquals(50,Insaurance.estimate(1000 , 500 ,false));
	
	}
	@MyTest
	public void test39() {
		//Premium p=new Premium();
		assertEquals(50,Insaurance.estimate(1000, 500,true	));
	
	}
	@MyTest
	public void test40() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate( 2000000,-500, true));
	
	}
	@MyTest
	public void test41() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate(-1000,2000 ,false));
	
	}
	@MyTest
	public void test42() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate(   -1000,500, false));
	
	}
	@MyTest
	public void test43() {
		//Premium p=new Premium();
		assertEquals(9,Insaurance.estimate( -1000, -500,false ));
	
	}
	@MyTest
	public void test44() {
		//Premium p=new Premium();
	//	assertEquals(-1,Premium.estimate(0,0,true));          covered in case 30
	
	}
	@MyTest
	public void test45() {
		//Premium p=new Premium();
		assertEquals(-1,Insaurance.estimate(-1000, 0  , false));
	
	}
	@MyTest
	public void test46() {
		//Premium p=new Premium();
		assertEquals(310,Insaurance.estimate( 5000, 500,  true));
	
	}
	@MyTest
	public void test47() {
		//Premium p=new Premium();
		assertEquals(300,Insaurance.estimate(5000 , 500,  true ));
	
	}
	@MyTest
	public void test48() {
		//Premium p=new Premium();
		assertEquals(60,Insaurance.estimate( 500 ,     500	 ,false));
	
	}

}

