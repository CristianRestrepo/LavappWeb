/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Usuario_TO;
import com.planit.lavappweb.webservices.implementaciones.ServiciosUsuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "sesionCT")
@SessionScoped
@ManagedBean
public class SesionCT implements Serializable {

    //variables
    private Usuario_TO usuario;
    private final ServiciosUsuario serviciosUsuario = new ServiciosUsuario();

    //Constructores
    public SesionCT() {
        usuario = new Usuario_TO();
    }

    //Getter & Setter
    public Usuario_TO getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario_TO usuario) {
        this.usuario = usuario;
    }

    //Metodos
    public void iniciarSesion() {
        FacesMessage message = new FacesMessage();
        //usuario = serviciosUsuario.ConsultarUsuarioPorLogin(usuario.getEmail());
        usuario = serviciosUsuario.consultarUsuarioPorLoginWSCliente(usuario.getEmail());
        if (!usuario.getEmail().isEmpty()) {
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", "" + usuario.getNombre());
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }

    public void cerrarSesion() {

    }

}
