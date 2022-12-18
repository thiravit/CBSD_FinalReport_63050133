/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import model.Covidapi1;

/**
 *
 * @author tph
 */
@WebService(serviceName = "Covid1WebService")
public class Covid1WebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Covid1SOAPServicePU");
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "findByYear")
    public Covidapi1 findByYear(@WebParam(name = "year") int year) {
        EntityManager em = emf.createEntityManager();
        Covidapi1 cov = em.find(Covidapi1.class, year);
        return cov;
    }
    
}
