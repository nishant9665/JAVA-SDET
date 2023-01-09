package test_I;


public class C {

	public static void main(String[] args) {
		A a = new B();
        a.a();
        System.out.println(a.a());
     //   a.b(); 
        
        B b = new B();
        System.out.println(b.a());
	}
}
