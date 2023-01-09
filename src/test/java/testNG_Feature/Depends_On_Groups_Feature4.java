package testNG_Feature;

import org.testng.annotations.Test;

public class Depends_On_Groups_Feature4 {
	@Test(dependsOnMethods= {"testcase3","testcase2"})  
	//@Test(dependsOnMethods= {"testcase3","testcase3","testcase3"}) // in this case it will take only one test case ,ignore other
	 public void testcase1()  
	 {  
	     System.out.println("This is test case1");  
	 }  
	 @Test  
	 public void testcase2()  
	 {  
	     System.out.println("This is test case2");  
	 }  
	 @Test  
	 public void testcase3()  
	 {  
	     System.out.println("This is test case3");  
	 }  
	   
	 
}
