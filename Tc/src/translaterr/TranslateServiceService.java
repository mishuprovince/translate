
package translaterr;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TranslateServiceService", targetNamespace = "http://service.xxl.com/", wsdlLocation = "http://localhost:9001/Service/TranslateService?wsdl")
public class TranslateServiceService
    extends Service
{

    private final static URL TRANSLATESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSLATESERVICESERVICE_EXCEPTION;
    private final static QName TRANSLATESERVICESERVICE_QNAME = new QName("http://service.xxl.com/", "TranslateServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9001/Service/TranslateService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSLATESERVICESERVICE_WSDL_LOCATION = url;
        TRANSLATESERVICESERVICE_EXCEPTION = e;
    }

    public TranslateServiceService() {
        super(__getWsdlLocation(), TRANSLATESERVICESERVICE_QNAME);
    }

    public TranslateServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSLATESERVICESERVICE_QNAME, features);
    }

    public TranslateServiceService(URL wsdlLocation) {
        super(wsdlLocation, TRANSLATESERVICESERVICE_QNAME);
    }

    public TranslateServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSLATESERVICESERVICE_QNAME, features);
    }

    public TranslateServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TranslateServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TranslateService
     */
    @WebEndpoint(name = "TranslateServicePort")
    public TranslateService getTranslateServicePort() {
        return super.getPort(new QName("http://service.xxl.com/", "TranslateServicePort"), TranslateService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TranslateService
     */
    @WebEndpoint(name = "TranslateServicePort")
    public TranslateService getTranslateServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.xxl.com/", "TranslateServicePort"), TranslateService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSLATESERVICESERVICE_EXCEPTION!= null) {
            throw TRANSLATESERVICESERVICE_EXCEPTION;
        }
        return TRANSLATESERVICESERVICE_WSDL_LOCATION;
    }

}
