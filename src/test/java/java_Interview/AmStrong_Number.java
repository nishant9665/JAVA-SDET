package java_Interview;

public class AmStrong_Number {

	public static void main(String[] args) {
		int num =153; // 1 + 125 +27 =153
		int temp=num;
		
		   int rev=0;
		   int rem=0;
			while(num>0) {
				rem=num%10;
				rev=rev+(rem*rem*rem);
				num=num/10;
				
			}
      if(temp==rev) {
    	  System.out.println("This is amstrong number");
      }
      else {
    	  System.out.println("This is not amstrong number");
      }
	}

}
