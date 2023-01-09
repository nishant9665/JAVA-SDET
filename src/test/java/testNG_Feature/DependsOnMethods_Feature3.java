package testNG_Feature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods_Feature3 {
	@Test  
	public void A_WebStudentLogin()  
	{  
	System.out.println("Student login through web");  
	Assert.assertFalse(true);
	}  
	@Test(dependsOnMethods= {"A_WebStudentLogin"})  
	public void API2()  
	{  
	System.out.println("Student login through API");  
	} 
	@Test  
	public void Mobile()  
	{  
	System.out.println("Student login through mobile");  
	}  
	 
}
