package com.xxl.service;
import javax.jws.WebService;

import javax.xml.ws.Endpoint;

import org.json.JSONException;

import com.baidu.TransApi;


@WebService
public class TranslateService {

	private static final String APP_ID = "20180105000112189";
	private static final String SECURITY_KEY = "aHJhXMiIn2ER0oBKAiY4";
	
	 public String getme(String text,String language) throws JSONException{
	 	TransApi api = new TransApi(APP_ID, SECURITY_KEY);
	 	String mm=api.getTransResult(text, "auto", language);
		System.out.println(mm);
		String xx=tools.tljson(mm);
		System.out.println(xx);
//      String zzString=xx.trim();
//		String yy=tools.unicode2String(zzString);
//		//System.out.println(i+"");
//		System.out.println(yy);
		return xx;
	 }

	 public static void main(String[] args) {
	 		// TODO Auto-generated method stub
	 		Endpoint.publish("http://localhost:9001/Service/TranslateService", new TranslateService());
	 		System.out.println("service success!");
	 	}
}
