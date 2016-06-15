/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Pais_TO;
import com.planit.lavappweb.webservices.implementaciones.ServiciosPais;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "paisCT")
@ViewScoped
@ManagedBean
public class PaisCT {

    private Pais_TO pais;
    private List<Pais_TO> paises;
    private ServiciosPais servicios;

    public PaisCT() {
        pais = new Pais_TO();
        paises = new ArrayList<>();
        servicios = new ServiciosPais();
    }

    @PostConstruct
    public void init(){
        paises = servicios.consultarPaises();
    }
    
    //Getters & Setter
    public Pais_TO getPais() {
        return pais;
    }

    public void setPais(Pais_TO pais) {
        this.pais = pais;
    }

    public List<Pais_TO> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais_TO> paises) {
        this.paises = paises;
    }
    
    //CRUD
    public void registrar(){
       pais = servicios.registrarPais(pais.getNombre());
       paises = servicios.consultarPaises();
    }
    
    public void modificar(){
        pais = servicios.modificarPais(pais.getIdPais(), pais.getNombre());
        paises = servicios.consultarPaises();
    }
    
    public void eliminar(){
        pais = servicios.Eliminar(pais.getIdPais());
        paises = servicios.consultarPaises();
    }
    
    //Metodos
}
