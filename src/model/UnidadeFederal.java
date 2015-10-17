/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Brizola
 */
public class UnidadeFederal {
     private String descricao;

    public UnidadeFederal(String descricao) {
        this.descricao = descricao;
    }
     
     

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
