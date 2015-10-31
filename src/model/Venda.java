/*
 * Classe para representar o modelo Venda
 */
package model;

import java.lang.reflect.Array;
import java.util.Date;

/**
 *
 * @author Felipe
 */
public class Venda {
    private Date dtmovimento;
    private Array produto;
    private int quantidade;
    private float valorpago;
    private float desconto;
    private float totalcompra;
    private float troco;
    private Array cliente;
    private Array vendedor;

    public Date getDtmovimento() {
        return dtmovimento;
    }

    public void setDtmovimento(Date dtmovimento) {
        this.dtmovimento = dtmovimento;
    }

    public Array getProduto() {
        return produto;
    }

    public void setProduto(Array produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorpago() {
        return valorpago;
    }

    public void setValorpago(float valorpago) {
        this.valorpago = valorpago;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getTotalcompra() {
        return totalcompra;
    }

    public void setTotalcompra(float totalcompra) {
        this.totalcompra = totalcompra;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }

    public Array getCliente() {
        return cliente;
    }

    public void setCliente(Array cliente) {
        this.cliente = cliente;
    }

    public Array getVendedor() {
        return vendedor;
    }

    public void setVendedor(Array vendedor) {
        this.vendedor = vendedor;
    }    
}
