package java_Interview;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		String name = sc.nextLine();
		String empt="";
		// Reverse the name
		
		for(int i=name.length()-1; i>=0;i--) {
			char name2= name.charAt(i);
			
			empt=empt+name2;			
		}
		System.out.println(empt);

		

	}

}
