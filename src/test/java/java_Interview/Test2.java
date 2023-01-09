package java_Interview;

public class Test2 {

	public static void main(String[] args) {
		
		
		
	
	    String str1="ABAACDDBB";
	    char ch [] = str1.toCharArray();
	    int count=0; 
	   for(int i=0;i<str1.length();i++) {
		  
		   
		   for(int j=i+1;j<str1.length();j++) { 
			   
			   if(ch[i]==ch[j]) {
				   
				   System.out.println(ch[i]);
				   break;
			   }
			   
			  
			   
		   }
		   
	   }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	//Output:- AA
	
	    String str2="ABCBBCCDDAA";
	//OutPut: - BB
	
	    String str3="ABCAAABB";
	
	  //  Out :- AA


	}

}
