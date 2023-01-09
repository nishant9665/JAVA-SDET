package testNG_Feature;

import org.testng.annotations.Test;

public class Fruits_Priority2_Feature5 {
 // this 0 priority , it will execute first ,(priority=0) 
	//In the above code, the default priority of mango() test method is 0, so it will be executed first
 	//If priority is not specified, then the default priority will be 0.
	@Test(priority=0)
	public void mango()  
	{  
	System.out.println("I am Mango-(priority=0)");  
	}  
	@Test(priority=10000)  
	public void apple()  
	{  
	System.out.println("I am Apple-priority=10000");  
	}  
	@Test(priority=-10000)  
	public void watermelon()  
	{  
	System.out.println("I am Watermelon-priority=-10000");  
	}  
	@Test(priority=-5001)  
	public void watermelon2()  
	{  
	System.out.println("I am Watermelon-priority=-5001");  
	}
}
