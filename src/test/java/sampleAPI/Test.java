package sampleAPI;

public class Test {

	//Java Program to replace lower-case characters with upper-case and vice-versa
	public static void main(String[] args) {
	
		String str1="Great Power";
		StringBuffer newStr=new StringBuffer(str1);
		String empt="";
		for (int i=0;i<str1.length();i++) {
			
			if(Character.isLowerCase(str1.charAt(i))) {
			newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
			}
		}
	}

}
