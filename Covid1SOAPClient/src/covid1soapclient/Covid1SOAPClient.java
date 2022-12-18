/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package covid1soapclient;

import services.Covidapi1;

/**
 *
 * @author tph
 */
public class Covid1SOAPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Covidapi1 covid = findByYear(2022);
        System.out.println(covid);
    }

    private static Covidapi1 findByYear(int year) {
        services.Covid1WebService_Service service = new services.Covid1WebService_Service();
        services.Covid1WebService port = service.getCovid1WebServicePort();
        return port.findByYear(year);
    }
    
}
