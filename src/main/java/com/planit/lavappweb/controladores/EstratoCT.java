/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Estado_TO;
import com.planit.lavappweb.modelos.Estrato_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "estratoCT")
@ViewScoped
public class EstratoCT {

    private Estrato_TO estrato;
    private List<Estrato_TO> estratos;
   
       
    public EstratoCT() {
        estrato = new Estrato_TO();
        estratos = new ArrayList<>();
    }

    @PostConstruct
    public void init(){
    
    }

    //Getter & Setter
    public Estrato_TO getEstrato() {
        return estrato;
    }

    public void setEstrato(Estrato_TO estrato) {
        this.estrato = estrato;
    }

    public List<Estrato_TO> getEstratos() {
        return estratos;
    }

    public void setEstratos(List<Estrato_TO> estratos) {
        this.estratos = estratos;
    }
    
    //Metodos
    public void registrar(){
    }
    
    public void modificar(){
    }
    
    public void eliminar(){
    }
    
}
