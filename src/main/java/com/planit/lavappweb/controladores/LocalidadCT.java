/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Localidad_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "localidadCT")
@ViewScoped
public class LocalidadCT {

    private Localidad_TO localidad;
    private List<Localidad_TO> localidades;

    public LocalidadCT() {
        localidad = new Localidad_TO();
        localidades = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
    }

    //Getter & Setter
    public Localidad_TO getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad_TO localidad) {
        this.localidad = localidad;
    }

    public List<Localidad_TO> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(List<Localidad_TO> localidades) {
        this.localidades = localidades;
    }

    //Metodos
    public void registrar() {
    }

    public void modificar() {
    }

    public void eliminar() {

    }
}
