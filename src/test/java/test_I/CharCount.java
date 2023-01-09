package test_I;

public class CharCount {

	public static void main(String[] args) {
		String str = "Hi Nishant Narwade";
				  char ch[]= str.toCharArray();
			       for(int i=0;i<ch.length;i++) {
			    	   int count=1;
			    	   for(int j=i+1;j<ch.length;j++) {
			    		   if(ch[i]==ch[j]) {
			    			   count++;
			    			   ch[j]='0';

			    			   
			    		   }
			    	   }
			    	   
			    	   if(count>=1 && ch[i]!='0') {
			    		   System.out.println("this is char :"+ch[i]+"  and count is "+count);
			    	   }
				
				 }
	
	}
}
				 

	
