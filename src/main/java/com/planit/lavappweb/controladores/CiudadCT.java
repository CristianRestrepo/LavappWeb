/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Ciudad_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "ciudadCT")
@ViewScoped
public class CiudadCT {

    private Ciudad_TO ciudad;
    private List<Ciudad_TO> ciudades;

    public CiudadCT() {
        ciudad = new Ciudad_TO();
        ciudades = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
    }

    //Getters & Setters
    public Ciudad_TO getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad_TO ciudad) {
        this.ciudad = ciudad;
    }

    public List<Ciudad_TO> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad_TO> ciudades) {
        this.ciudades = ciudades;
    }
    
    //Metodos    
    public void registrar(){    
    }
    
    public void modificar(){    
    }
    
    public void eliminar(){    
    }
}
