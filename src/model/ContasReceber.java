/*
 * Classe para representar contas a receber
 */
package model;

import java.util.Date;

/**
 * @author Maike
 */
public class ContasReceber {

    private String contasreceber;
    private String numpedido;
    private String parcelas;
    private String cliente;
    private String formapgto;
    private String diasatraso;
    private String observacao;
    private Date dtemissao;
    private Date dtvencimento;
    private Date dtrecebimento;
    private float vlrreceber;
    private float juros;
    private float total;
    private float vlrrecebido;

    public ContasReceber(String contasreceber, String numpedido, String cliente, String formapgto, Date dtemissao, Date dtvencimento, Date dtrecebimento, float vlrreceber, float total, float vlrrecebido) {
        this.contasreceber = contasreceber;
        this.numpedido = numpedido;
        this.cliente = cliente;
        this.formapgto = formapgto;
        this.dtemissao = dtemissao;
        this.dtvencimento = dtvencimento;
        this.dtrecebimento = dtrecebimento;
        this.vlrreceber = vlrreceber;
        this.total = total;
        this.vlrrecebido = vlrrecebido;
    }

    public String getContasreceber() {
        return contasreceber;
    }

    public void setContasreceber(String contasreceber) {
        this.contasreceber = contasreceber;
    }

    public String getNumpedido() {
        return numpedido;
    }

    public void setNumpedido(String numpedido) {
        this.numpedido = numpedido;
    }

    public String getParcelas() {
        return parcelas;
    }

    public void setParcelas(String parcelas) {
        this.parcelas = parcelas;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFormapgto() {
        return formapgto;
    }

    public void setFormapgto(String formapgto) {
        this.formapgto = formapgto;
    }

    public String getDiasatraso() {
        return diasatraso;
    }

    public void setDiasatraso(String diasatraso) {
        this.diasatraso = diasatraso;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public Date getDtvencimento() {
        return dtvencimento;
    }

    public void setDtvencimento(Date dtvencimento) {
        this.dtvencimento = dtvencimento;
    }

    public Date getDtrecebimento() {
        return dtrecebimento;
    }

    public void setDtrecebimento(Date dtrecebimento) {
        this.dtrecebimento = dtrecebimento;
    }

    public float getVlrreceber() {
        return vlrreceber;
    }

    public void setVlrreceber(float vlrreceber) {
        this.vlrreceber = vlrreceber;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getVlrrecebido() {
        return vlrrecebido;
    }

    public void setVlrrecebido(float vlrrecebido) {
        this.vlrrecebido = vlrrecebido;
    }

}
