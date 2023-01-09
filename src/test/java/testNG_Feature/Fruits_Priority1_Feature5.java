package testNG_Feature;

import org.testng.annotations.Test;

public class Fruits_Priority1_Feature5 {
	@Test // this 0 priority , it will execute first ,(priority=0) 
	//In the above code, the default priority of mango() test method is 0, so it will be executed first
 	//If priority is not specified, then the default priority will be 0.
	public void mango()  
	{  
	System.out.println("I am Mango-(priority=0)");  
	}  
	@Test(priority=2)  
	public void apple()  
	{  
	System.out.println("I am Apple-priority=2");  
	}  
	@Test(priority=1)  
	public void watermelon()  
	{  
	System.out.println("I am Watermelon-priority=1");  
	}  
}
