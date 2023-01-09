package test_I;

public class Child extends Parent{
	
	static void disp1() {
         System.out.println("disp2");
	}

	public static void main(String[] args) {
      disp1();
      Parent.disp1();
	}

}
