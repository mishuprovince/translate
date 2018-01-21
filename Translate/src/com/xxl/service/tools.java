package com.xxl.service;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class tools {
	public static  String tljson(String str) throws JSONException{
		JSONObject obj = new JSONObject(str);
			JSONArray array = obj.getJSONArray("trans_result");
        obj = array.getJSONObject(0);
        String word = obj.getString("dst");
        return word;
	}
	public static String unicode2String(String unicode) {  
 	   
        StringBuffer string = new StringBuffer();  
       
        String[] hex = unicode.split("\\\\u");  
       
        for (int i = 1; i < hex.length; i++) {  
        
            int data = Integer.parseInt(hex[i], 16);  

            string.append((char) data);  
        }  
        return string.toString();  
    }
}
