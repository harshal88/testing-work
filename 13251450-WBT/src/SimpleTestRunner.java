//package cs608.cs.nuim.ie;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

public class SimpleTestRunner 
{
	private static OutputStream log;
	private int totalRuns=0, totalPasses=0, totalFails=0;
	private int runs=0, passes=0, fails=0;
	
	public void runTests(String testClass) 
	{
		String reason="<unknown>";
			runs=0; passes=0; fails=0;
			System.out.println();
			System.out.println("Executing tests from "+testClass);
			System.out.println("Class under test="+getSut(testClass));
			System.out.println("Test execution results");
			try 
			{
				Class<?> c = Class.forName(testClass);
				Object o = c.newInstance();
				for (Method m:c.getMethods()) 
				{
					boolean thisTestPassed=false;
					if (m.isAnnotationPresent(MyTest.class)) 
					{
						int tid = m.getAnnotation(MyTest.class).tid;
						String testType = m.getAnnotation(MyTest.class).testType;
						// todo: check tid & testType here before running the test
						System.out.print("   Test [" + tid + "," + testType + "]" + m.getName() + " ");
						runs++;
						try 
						{
							m.invoke(o);
							passes++;
							System.out.println("passed.");
						}
						catch (java.lang.reflect.InvocationTargetException e) 
						{
						// find the assertion error - should really search for
						//		    a line beginning "   at <test class name"
								reason = e.getCause().toString() + " in " +    
								e.getCause().getStackTrace()[5];
													fails++;
													System.out.println("failed: "+reason);
						}
					}
				}
			}
			catch (Throwable ex) 
			{
				System.out.println("   unexpected test execution failure.");
				ex.printStackTrace();
			}
			totalRuns += runs;
			totalPasses += passes;
			totalFails += fails;
		}


	/*
	 * Get the details of the software under test
	 * @param testClass the name of the test class
	 * @return the sut details
	*/
	String getSut(String className) {
		String details="";
		try {
			Class<?> c = Class.forName(className);
			Method m=c.getMethod("sut");
			details = (String)m.invoke(null);
		}
		catch (Exception e) {
			details = "** Error: Test class does not provide public String sut()";
			e.printStackTrace();
		}
		return details;
	}

	//Print test class results
	void printTSStats() 
	{
		String overall="PASS";
		if (fails>0) overall="FAIL";
		System.out.println("Test class results:");
		System.out.println("   Tests run="+totalRuns);
		System.out.println("   Tests passed="+totalPasses);
		System.out.println("   Tests failed="+totalFails);
		System.out.println("   Test Class Result="+overall);
	}
	
	//Print the overall test results
	void printStats() 
	{
		String overall="PASS";
		if (totalFails>0) overall="FAIL";
		System.out.println();
		System.out.println("Overall test results:");
		System.out.println("   Tests run="+totalRuns);
		System.out.println("   Tests passed="+totalPasses);
		System.out.println("   Tests failed="+totalFails);
		System.out.println("   Overall result="+overall);
	}

	//@param List of the names of the test class
	public static void main(String[] args) throws FileNotFoundException 
	{
		System.setOut(new PrintStream("log.txt"));

		SimpleTestRunner r=new SimpleTestRunner();
		
		// Check input arguments
		if (args.length==0) {
			System.out.println("Pass names of test classes as arguments");
		}
		else {
			// run the tests
			for (String s:args)
			{
				r.runTests(s);
				
				r.printTSStats();
			}
			r.printStats();
		}
		
		
	}
	
}