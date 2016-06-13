/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Pais_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "paisCT")
@ViewScoped
public class PaisCT {

    private Pais_TO pais;
    private List<Pais_TO> paises;

    public PaisCT() {
        pais = new Pais_TO();
        paises = new ArrayList<>();
    }

    @PostConstruct
    public void init(){
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
    
    //Metodos
    public void registrar(){
    }
    
    public void modificar(){
    }
    
    public void eliminar(){
    }
}
