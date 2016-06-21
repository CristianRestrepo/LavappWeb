/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Localidad_TO;
import com.planit.lavappweb.webservices.implementaciones.ServiciosLocalidad;
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
    protected ServiciosLocalidad servicios;

    public LocalidadCT() {
        localidad = new Localidad_TO();
        localidades = new ArrayList<>();
        servicios = new ServiciosLocalidad();
    }

    @PostConstruct
    public void init() {
        localidades = servicios.consultarLocalidades();
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
        localidad = servicios.registrarLocalidad(localidad.getNombre(), localidad.getCiudad().getIdCiudad());
        localidades = servicios.consultarLocalidades();
    }

    public void modificar() {
        localidad = servicios.editarLocalidad(localidad.getIdLocalidad(), localidad.getNombre(), localidad.getCiudad().getIdCiudad());
        localidades = servicios.consultarLocalidades();
    }

    public void eliminar() {
        localidad = servicios.eliminarLocalidad(localidad.getIdLocalidad());
        localidades = servicios.consultarLocalidades();
    }
}
