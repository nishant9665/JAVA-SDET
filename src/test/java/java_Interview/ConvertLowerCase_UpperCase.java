package java_Interview;

public class ConvertLowerCase_UpperCase {

	public static void main(String[] args) {
		String str ="ApPLe";
		String out="aPplE";

		String empt="";
		char[] ch = str.toCharArray();

		for(int i=0;i<ch.length;i++){
		 
		    if(Character.isUpperCase(ch[i])){
		    	 char ch3 = Character.toLowerCase(ch[i]); 
		         empt=empt+ch3 ;

		}
		 else{
			 char ch4 = Character.toUpperCase(ch[i]); 
	         empt=empt+ch4 ;
		 }       
		 
		}
		System.out.println(empt);

	}

}
