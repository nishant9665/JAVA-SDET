package java_Interview;

import java.util.Scanner;

public class DuplicateChar_InString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		String name = sc.nextLine();
		char [] arr1 =name.toCharArray();
		boolean flag= true;
		
		for(int i=0; i<arr1.length;i++) {
			
			for(int j=i+1;j<arr1.length;j++) {
				
				if(arr1[i]==arr1[j]) {
					System.out.println(arr1[i]);
					flag=false;
					break;
				}
			}
			
		}
		if(flag) {
			System.out.println("Duplicate char not found");
		}

	}

}
