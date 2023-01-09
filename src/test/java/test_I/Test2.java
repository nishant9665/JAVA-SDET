package test_I;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 // for loop
		 
		 for (int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		 System.out.println("---------While Loop-----------");
		 // while loop
		 int j=0;
		 while(list.size()>j) {
			 System.out.println(list.get(j));
			 j++;
		 }
		 System.out.println("---------For each Loop-----------");
		 // for each
		 for (String al:list) {
			 System.out.println(al);
		 }
		 System.out.println("---------Iterator Loop-----------");
		 Iterator itr =list.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 //Iterating the List element using for-each loop  
		 

	}

}
