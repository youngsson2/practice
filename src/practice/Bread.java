package practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Bread {
	
	public JSONArray test1() throws IOException, ParseException {
		
		String filePath = "C:\\youngsunchoi\\algorithm\\practice\\WebContent\\WEB-INF\\json\\bread.json";
		FileReader fileReader = new FileReader(filePath);
		
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonArray = (JSONArray) jsonParser.parse(fileReader);
		
		return jsonArray;
	}
	
	public static void main(String[] args) {
		Bread bread = new Bread();
		
		try {
			JSONArray jsonArray = bread.test1();
			
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject jsonObject = (JSONObject) jsonArray.get(i);
				System.out.println("breadType:" + jsonObject.get("breadType"));
				
				JSONObject jsonObject2 = (JSONObject)jsonObject.get("recipe");
				Iterator it = jsonObject2.keySet().iterator();
				
				System.out.println("recipe");
				while (it.hasNext()) {
					String key = (String) it.next();
					Object value = (Object) jsonObject2.get(key);
					System.out.println(key + ":" + value);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ParseException e) {
			e.printStackTrace();
		}
	}
}
