package entity;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import translaterr.JSONException_Exception;
import translaterr.TranslateService;

public class translatehelp {
public static  String tl(String text,int i) throws MalformedURLException, JSONException_Exception{
	URL url=new URL("http://localhost:9001/Service/TranslateService?wsdl");
	QName qName=new QName("http://service.xxl.com/","TranslateServiceService");
	Service service=Service.create(url,qName);
	TranslateService translateService=service.getPort(TranslateService.class);
	String mm=translateService.getme(text,cheak(i));
	System.out.println(mm);
	return mm;
}
static String []ty={"zh","en","jp","kor","fra","spa","th","ara","ru","pt","de","it","el","nl","pl","bul","est","dan","fin","cs","rom","slo","swe","hu","cht","vie"};
private static   String cheak(int i){
	return ty[i];
}

}
