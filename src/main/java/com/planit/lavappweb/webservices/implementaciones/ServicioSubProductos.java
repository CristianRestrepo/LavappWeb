/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.webservices.implementaciones;

import com.planit.lavappweb.modelos.SubProducto_TO;
import com.planit.lavappweb.webservices.clientes.ClienteConsultarSubProductos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public class ServicioSubProductos {
    
    public List<SubProducto_TO> consultarSubProductos(){
        List<SubProducto_TO> listaModelo = new ArrayList<>();
        ClienteConsultarSubProductos clienteSubP = new ClienteConsultarSubProductos();
        try {
            listaModelo = clienteSubP.consultarSubProducto(List.class);
        } catch (Exception e) {
            throw e;
        }
        return listaModelo;
    }
    
}
