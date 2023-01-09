package test_I;

public class Test3 {

	public static void main(String[] args) {
		String s1="triangle";
		char [] ch1=s1.toCharArray();
		String s2="integral";
		char [] ch2=s2.toCharArray();

				boolean falg=false;
				String empt="";
				for (int i=0;i<ch1.length;i++ ){ //t
				     for(int j=0;j<ch2.length;j++){ //i
				    	
				    	 
				       if(ch1.length==ch2.length) {
				           if(ch1[i]==ch2[j]){
				           empt=empt+ch1[i];
				           ch2[i]='0';
				           } 
				      }
				     
				        }
				     
				     if(empt.length()==s1.length() && ch1[i]!='0'){
						falg=true;
						}
						
						   
						 }
				
				if(falg) {
					System.out.println("This is Anagram");
				}
				else {
					System.out.println("This is not Anagram");
				}
				   
				     } 
				
				

	   
	}


