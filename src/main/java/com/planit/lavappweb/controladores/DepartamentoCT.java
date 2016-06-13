/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Departamento_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "departamentoCT")
@ViewScoped
public class DepartamentoCT {

    private Departamento_TO departamento;
    private List<Departamento_TO> departamentos;

    public DepartamentoCT() {
        departamento = new Departamento_TO();
        departamentos = new ArrayList<>();
    }

    @PostConstruct
    public void init(){
    }

    //Getter & Setter
    public Departamento_TO getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento_TO departamento) {
        this.departamento = departamento;
    }

    public List<Departamento_TO> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento_TO> departamentos) {
        this.departamentos = departamentos;
    }
    
    //Metodos    
    public void registrar(){
    }
    
    public void modificar(){
    }
    
    public void eliminar(){
    }
}
