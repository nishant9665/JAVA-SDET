package java_Interview;

public class ReverseString_SamePositions {

	public static void main(String[] args) {
		String str= "Nishant Narwade Nanded";
		String [] astr= str.split(" ");
		String empt="";
		
		for (int i=0;i<astr.length;i++) {
			String str2=astr[i];
			int count=1;
			char ch[]=str2.toCharArray();
			
			for(int j=str2.length()-1;j>=0;j--) {
				empt=empt+ch[j];
			}
			count=count+1;
			if(count>=1) {
				empt=empt+" ";
			}
			
		}
		System.out.println(empt);
	}
}
