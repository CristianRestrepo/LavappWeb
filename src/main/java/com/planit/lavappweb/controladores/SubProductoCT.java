/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.SubProducto_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "subProductoCT")
@ViewScoped
public class SubProductoCT {

    private SubProducto_TO subproducto;
    private List<SubProducto_TO> subproductos;
    
    public SubProductoCT() {
        subproducto = new SubProducto_TO();
        subproductos = new ArrayList<>();
    }
    
    @PostConstruct
    public void init(){
    }
    
    //Getter & Setter
    public SubProducto_TO getSubproducto() {
        return subproducto;
    }

    public void setSubproducto(SubProducto_TO subproducto) {
        this.subproducto = subproducto;
    }

    public List<SubProducto_TO> getSubproductos() {
        return subproductos;
    }

    public void setSubproductos(List<SubProducto_TO> subproductos) {
        this.subproductos = subproductos;
    }

    //Metodos
    public void registrar(){
    }
    
    public void modificar(){
    }
    
    public void eliminar(){
    }
}
