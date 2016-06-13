/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Producto_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "ProductoCT")
@ViewScoped
public class ProductoCT {

    private Producto_TO producto;
    private List<Producto_TO> productos;

    public ProductoCT() {
        producto = new Producto_TO();
        productos = new ArrayList<>();
    }

    @PostConstruct
    public void init() {

    }

    //Getter & Setter
    public Producto_TO getProducto() {
        return producto;
    }

    public void setProducto(Producto_TO producto) {
        this.producto = producto;
    }

    public List<Producto_TO> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto_TO> productos) {
        this.productos = productos;
    }

    //Metodos
    public void registrar() {
    }

    public void modificar() {
    }

    public void eliminar(){
    }
}
