package java_Interview;

public class StringChar_Count {

	public static void main(String[] args) {
		
		String str= "nishant narwade";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++){
				if(ch[i]==ch[j]) {
					count=count+1;
					ch[j]='-';
				}
			}
			
			if(ch[i]!='-' && count>=1 && ch[i]!=' ')
			System.out.println(ch[i]+" Count is: "+count);
		}

	}

}
