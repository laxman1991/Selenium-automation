package com.json.test;
//import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonDemo {

	public static void main(String[] args) {

		//Json Objct s to wrie 
		
	    JSONObject jsonObject= new JSONObject();
	    jsonObject.put("name","laxman");
	    jsonObject.put("RollNo","10");
	    jsonObject.put("Address","Nerul");
	    jsonObject.put("Pincode","400706");
	    jsonObject.put("Mob","9020154296");
	    
	    JSONArray jarray=new JSONArray();
	    jarray.add("January");
	    jarray.add("February");
	    jarray.add("March");
	    jarray.add("April");
	    jarray.add("May");
	    jarray.add("June");
		jsonObject.put("Months",jarray);
		
		try
				{
			FileWriter file=new FileWriter("D:/MySeleniumPractice/ActionClassDemo/src/person.json");
					file.write(jsonObject.toString());
					file.flush();
				}
		catch (FileNotFoundException e) {
            e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(jsonObject.toJSONString());
	}
}
