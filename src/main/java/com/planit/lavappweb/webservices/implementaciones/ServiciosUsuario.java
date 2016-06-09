/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.webservices.implementaciones;

import com.planit.lavappweb.metodos.ServerRequests;
import com.planit.lavappweb.modelos.Usuario_TO;
//import com.planit.lavappweb.webservices.clientes.ClienteConsultarExistenciaUsuario;
import com.planit.lavappweb.webservices.clientes.ClienteConsultarUsuarioPorLogin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public class ServiciosUsuario {

    private ServerRequests sr = new ServerRequests();
    private final Usuario_TO usuario = new Usuario_TO();
    private final List<Usuario_TO> usuarios = new ArrayList<>();
    String ruta = sr.BuscarRuta();       
    
    public Usuario_TO consultarUsuarioPorLoginWSCliente(String email){
        ClienteConsultarUsuarioPorLogin cliente = new ClienteConsultarUsuarioPorLogin();
        Usuario_TO usuario = cliente.consultarUsuarioPorLogin(Usuario_TO.class, email);
        return usuario;
    }
    
//    public Boolean consultarExistenciaUsuarioWSCliente(String email){
//        ClienteConsultarExistenciaUsuario cliente = new ClienteConsultarExistenciaUsuario();
//        boolean existe = cliente.consultarExistenciaUsuario(boolean.class, email);
//        return existe;
//    }
}
