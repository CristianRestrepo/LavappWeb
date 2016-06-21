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
 * Jersey REST client generated for REST resource:we [consultarProductos]<br>
 * USAGE:
 * <pre>
 *        ClienteConsultarProductos client = new ClienteConsultarProductos();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author SISTEMAS
 */
public class ClienteConsultarProductos {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8084/LavappService/webresources/";

    public ClienteConsultarProductos() {
//        client = javax.ws.rs.client.ClientBuilder.newClient();
        client = ResteasyClientBuilder.newBuilder().build();
        webTarget = client.target(BASE_URI).path("consultarProductos");
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T consultarProductos(Class<T> responseType) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}
