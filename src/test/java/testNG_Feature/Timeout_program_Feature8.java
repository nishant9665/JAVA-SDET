package testNG_Feature;

import org.testng.annotations.Test;

public class Timeout_program_Feature8 {
	@Test(timeOut=200)  
	public void testcase1() throws InterruptedException  
	{  
	Thread.sleep(500);  
	System.out.println("This is testcase1");  
	}  
	
	@Test    
	public void testcaes2()  
	{  
	System.out.println("This is testcase2");  
    }  
	
	@Test  
	public void testcase3()  
	{  
	System.out.println("This is testcase3");  
	}  

}
