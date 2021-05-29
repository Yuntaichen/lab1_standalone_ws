
package com.labs.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.labs.client.generated package. 
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

    private final static QName _GetStudentsByFields_QNAME = new QName("http://labs.com/", "getStudentsByFields");
    private final static QName _GetStudentsByFieldsResponse_QNAME = new QName("http://labs.com/", "getStudentsByFieldsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.labs.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentsByFieldsResponse }
     * 
     */
    public GetStudentsByFieldsResponse createGetStudentsByFieldsResponse() {
        return new GetStudentsByFieldsResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByFields }
     * 
     */
    public GetStudentsByFields createGetStudentsByFields() {
        return new GetStudentsByFields();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://labs.com/", name = "getStudentsByFields")
    public JAXBElement<GetStudentsByFields> createGetStudentsByFields(GetStudentsByFields value) {
        return new JAXBElement<GetStudentsByFields>(_GetStudentsByFields_QNAME, GetStudentsByFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByFieldsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://labs.com/", name = "getStudentsByFieldsResponse")
    public JAXBElement<GetStudentsByFieldsResponse> createGetStudentsByFieldsResponse(GetStudentsByFieldsResponse value) {
        return new JAXBElement<GetStudentsByFieldsResponse>(_GetStudentsByFieldsResponse_QNAME, GetStudentsByFieldsResponse.class, null, value);
    }

}
