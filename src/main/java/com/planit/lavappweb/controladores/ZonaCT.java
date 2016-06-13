/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Zona_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "zonaCT")
@ViewScoped
public class ZonaCT {

    private Zona_TO zona;
    private List<Zona_TO> zonas;

    public ZonaCT() {
        zona = new Zona_TO();
        zonas = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
    }

    //Getter & Setter
    public Zona_TO getZona() {
        return zona;
    }

    public void setZona(Zona_TO zona) {
        this.zona = zona;
    }

    public List<Zona_TO> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona_TO> zonas) {
        this.zonas = zonas;
    }

    //Metodos
    public void registrar() {
    }
    
    public void modificar(){
    }
    
    public void eliminar(){
    }
}
