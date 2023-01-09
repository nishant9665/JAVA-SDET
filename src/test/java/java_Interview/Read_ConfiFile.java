package java_Interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class Read_ConfiFile {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("./Data/Configuration.properties"));
		Properties properties = new Properties();
		properties.load(reader);
		String baseUrl=(String) properties.get("base_Url");
		System.out.println(baseUrl);
		
		String userid=(String) properties.get("user_Id");
		System.out.println(userid);
		
		String password=(String) properties.get("password");
		System.out.println(password);
		
		String AdharId=(String) properties.get("AdharId");
		System.out.println(AdharId);
		
		String Panumber=(String) properties.get("Panumber");
		System.out.println(Panumber);

	}

}
