/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.SubServicio_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "subServicioCT")
@ViewScoped
public class SubServicioCT {

    private SubServicio_TO subServicio;
    private List<SubServicio_TO> subServicios;
    
    public SubServicioCT() {
        subServicio = new SubServicio_TO();
        subServicios = new ArrayList<>();
    }
    
    @PostConstruct
    public void init(){
    }
    
    //Getter & Setter

    public SubServicio_TO getSubServicio() {
        return subServicio;
    }

    public void setSubServicio(SubServicio_TO subServicio) {
        this.subServicio = subServicio;
    }

    public List<SubServicio_TO> getSubServicios() {
        return subServicios;
    }

    public void setSubServicios(List<SubServicio_TO> subServicios) {
        this.subServicios = subServicios;
    }
    
    //Metodos
    public void registrar(){
    }
    
    public void modificar(){
    }
    
    public void eliminar(){
    }
}
