/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Pedido_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Desarrollo_Planit
 */
@Named(value = "pedidoCT")
@ViewScoped
public class PedidoCT {

    private Pedido_TO pedido;
    private List<Pedido_TO> pedidos;

    public PedidoCT() {
        pedido = new Pedido_TO();
        pedidos = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
    }

    //Getter & Setter
    public Pedido_TO getPedido() {
        return pedido;
    }

    public void setPedido(Pedido_TO pedido) {
        this.pedido = pedido;
    }

    public List<Pedido_TO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido_TO> pedidos) {
        this.pedidos = pedidos;
    }

    //Metodos
    public void registrar() {
    }

    public void modificar() {
    }
    
    public void eliminar(){
    }
}
