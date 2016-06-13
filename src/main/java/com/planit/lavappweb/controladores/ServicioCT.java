/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Servicio_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "servicioCT")
@ViewScoped
public class ServicioCT {

    private Servicio_TO servicio;
    private List<Servicio_TO> servicios;
    
    public ServicioCT() {
        servicio = new Servicio_TO();
        servicios = new ArrayList<>();
    }
    
    @PostConstruct
    public void init(){
    
    }
    
    //Getter & Setter
    public Servicio_TO getServicio() {
        return servicio;
    }

    public void setServicio(Servicio_TO servicio) {
        this.servicio = servicio;
    }

    public List<Servicio_TO> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio_TO> servicios) {
        this.servicios = servicios;
    }
    
    //Metodos
    public void registrar(){
    
    }
    
    public void modificar(){
    
    }
    
    public void eliminar(){
    
    }
}
