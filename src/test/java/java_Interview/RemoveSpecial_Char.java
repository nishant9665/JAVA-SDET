package java_Interview;

public class RemoveSpecial_Char {

	public static void main(String[] args) {
		
		String str="*n%is!@han#t904/-+narwade nanded";
		String remstr=str.replaceAll("[^a-zA-Z0-9]", "");//including small .capital and number
		System.out.println(remstr);
		
		String remstr2=str.replaceAll("[^a-zA-Z]", "");//removing number
		System.out.println(remstr2);
		boolean bb =remstr2.contains("nanded");
		System.out.println(bb);

	}

}
