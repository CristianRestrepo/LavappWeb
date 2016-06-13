/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Barrio_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "barrioCT")
@ViewScoped
public class BarrioCT {

    private Barrio_TO barrio;
    private List<Barrio_TO> barrios;

    public BarrioCT() {
        barrio = new Barrio_TO();
        barrios = new ArrayList<>();
    }
    
    @PostConstruct
    public void init(){
    }

    //Getters & Setters
    public Barrio_TO getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio_TO barrio) {
        this.barrio = barrio;
    }

    public List<Barrio_TO> getBarrios() {
        return barrios;
    }

    public void setBarrios(List<Barrio_TO> barrios) {
        this.barrios = barrios;
    }
    
    //Metodos    
    public void registrar(){
    }
    
    public void modificar(){
    }
    
    public void eliminar(){
    }

}
