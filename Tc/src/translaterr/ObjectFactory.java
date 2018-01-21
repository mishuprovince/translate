
package translaterr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the translaterr package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JSONException_QNAME = new QName("http://service.xxl.com/", "JSONException");
    private final static QName _Getme_QNAME = new QName("http://service.xxl.com/", "getme");
    private final static QName _GetmeResponse_QNAME = new QName("http://service.xxl.com/", "getmeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: translaterr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JSONException }
     * 
     */
    public JSONException createJSONException() {
        return new JSONException();
    }

    /**
     * Create an instance of {@link Getme }
     * 
     */
    public Getme createGetme() {
        return new Getme();
    }

    /**
     * Create an instance of {@link GetmeResponse }
     * 
     */
    public GetmeResponse createGetmeResponse() {
        return new GetmeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JSONException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JSONException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.xxl.com/", name = "JSONException")
    public JAXBElement<JSONException> createJSONException(JSONException value) {
        return new JAXBElement<JSONException>(_JSONException_QNAME, JSONException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Getme }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.xxl.com/", name = "getme")
    public JAXBElement<Getme> createGetme(Getme value) {
        return new JAXBElement<Getme>(_Getme_QNAME, Getme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetmeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetmeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.xxl.com/", name = "getmeResponse")
    public JAXBElement<GetmeResponse> createGetmeResponse(GetmeResponse value) {
        return new JAXBElement<GetmeResponse>(_GetmeResponse_QNAME, GetmeResponse.class, null, value);
    }

}
