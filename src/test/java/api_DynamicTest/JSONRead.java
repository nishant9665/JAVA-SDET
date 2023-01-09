package api_DynamicTest;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		JSONParser jsonParese = new JSONParser();
		
		FileReader reader = new FileReader("./Data/jsonFile.json");
		
		Object obj= jsonParese.parse(reader);
		JSONObject jsonObject= (JSONObject)obj;
		
		String fname= (String)jsonObject.get("firstName");
		System.out.println(fname);
		
				
		
	}

}
