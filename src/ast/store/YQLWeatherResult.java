package ast.store;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class YQLWeatherResult {
	public YQLWeatherResult() {
		try
		{
			URL url = new URL("http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%3D%2218637%22&format=json&diagnostics=true&callback=cbfunc");
			URLConnection connection = url.openConnection();
			
			String line;
			StringBuilder builder = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			while((line = reader.readLine()) != null) {
			builder.append(line);
			}
			
			System.out.println(builder.toString());
			
			JSONParser parse = new JSONParser();
			
			parse.parse(builder.toString());
			
			System.out.println(parse.parse(builder.toString()).toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
