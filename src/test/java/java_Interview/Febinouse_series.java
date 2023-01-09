package java_Interview;

public class Febinouse_series {

	public static void main(String[] args) {
		int a=0;
		int b=1; // a=0 b=1 c=1 2 3 5 8 13
		System.out.print(a);
		System.out.print(" "+b);
		
		for(int i=0;i<10;i++) {
			
			int c=a+b;
			
			System.out.print(" "+c);
			
			a=b;
			b=c;
		}

	}

}
