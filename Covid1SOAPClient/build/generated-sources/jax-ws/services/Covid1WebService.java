
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Covid1WebService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Covid1WebService {


    /**
     * 
     * @param year
     * @return
     *     returns services.Covidapi1
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByYear", targetNamespace = "http://services/", className = "services.FindByYear")
    @ResponseWrapper(localName = "findByYearResponse", targetNamespace = "http://services/", className = "services.FindByYearResponse")
    @Action(input = "http://services/Covid1WebService/findByYearRequest", output = "http://services/Covid1WebService/findByYearResponse")
    public Covidapi1 findByYear(
        @WebParam(name = "year", targetNamespace = "")
        int year);

}
