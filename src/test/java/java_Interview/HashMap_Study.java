package java_Interview;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Study {

	public static void main(String[] args) {
		 HashMap<Integer,String> map=new HashMap<Integer,String>();
		 
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");  
	      map.put(103, "Gaurav");  
	   
	      for( Map.Entry<Integer,String> mp: map.entrySet()) {
	    	System.out.println(mp.getValue()+" "+mp.getKey());
	    }
	      
	    System.out.println("------------------");
	    map.remove(101);
	    for( Map.Entry<Integer,String> mp: map.entrySet()) {
	    	System.out.println(mp.getValue()+" "+mp.getKey());
	    	
	    }
	    map.remove("Rahul");
	    
	    System.out.println("------------------");
	
	    for( Map.Entry<Integer,String> mp: map.entrySet()) {
	    	System.out.println(mp.getValue()+" "+mp.getKey());
	    	
	    }
	}

}
