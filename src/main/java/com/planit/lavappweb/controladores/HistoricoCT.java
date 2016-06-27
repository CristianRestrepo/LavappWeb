/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.planit.lavappweb.controladores;

import com.planit.lavappweb.modelos.Historico_TO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author Desarrollo_Planit
 */

public class HistoricoCT {

    private Historico_TO historico;
    private List<Historico_TO> historicos;

    public HistoricoCT() {
        historico = new Historico_TO();
        historicos = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
    }

    //Getter & Setter
    public Historico_TO getHistorico() {
        return historico;
    }

    public void setHistorico(Historico_TO historico) {
        this.historico = historico;
    }

    public List<Historico_TO> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(List<Historico_TO> historicos) {
        this.historicos = historicos;
    }

    //Metodos
    public void registrar() {
    }

    public void modificar() {
    }

    public void eliminar() {
    }
}
