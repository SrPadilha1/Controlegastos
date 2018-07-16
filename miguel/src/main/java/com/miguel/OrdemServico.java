/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class OrdemServico {

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the valorTotal
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    private int ordemServico;

    /**
     * @return the OrdemServico
     */
    public int getOrdemServico() {
        return ordemServico;
    }

    /**
     * @param OrdemServico the OrdemServico to set
     */
    public void setOrdemServico(int OrdemServico) {
        this.ordemServico = OrdemServico;
    }
    private Date data;
    private Double valorTotal; 


    
}
