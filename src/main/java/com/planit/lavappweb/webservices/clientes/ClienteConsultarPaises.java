/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.webservices.clientes;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

/**
 * Jersey REST client generated for REST resource:we [consultarPaises]<br>
 * USAGE:
 * <pre>
 *        ClienteConsultarPaises client = new ClienteConsultarPaises();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Desarrollo_Planit
 */
public class ClienteConsultarPaises {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8084/LavappService/webresources/";

    public ClienteConsultarPaises() {
        client = ResteasyClientBuilder.newBuilder().build();
//        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("consultarPaises");
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T consultarPaises(Class<T> responseType) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
        }

    public void close() {
        client.close();
    }

}
