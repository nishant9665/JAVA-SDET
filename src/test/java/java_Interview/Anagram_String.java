package java_Interview;

public class Anagram_String {

	public static void main(String[] args) {
		
		String str1="triangle";
		String str2="integral";
		String str3="";
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		if(str1.length()==str2.length()) {
			
			for(int i=0;i<str1.length();i++) {
				for(int j=0;j<str2.length();j++) {
					
					if(ch1[i]==ch2[j]) {
						str3=str3+ch1[i];
					}
				}
			}
			if(str1.equals(str3)) {
				System.out.println("This is anagam");
			}
			else {
				System.out.println("This is not a anagram");
			}
		}
		else {
			System.out.println("This is not anagram");
		}

	}

}
