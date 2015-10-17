/*
 * Classe Contaspagar onde o cliente tera todas os seus debitos com a farmacia
 */
package model;

import java.util.Date;

/**
 *
 * @author Luiz Henrique Sieber
 */
public class Contaspagar {
    private String Nome,motivo,responsavel;
    private int parcela, contaspagar, Idfornecedor, Idformapagamento,duplicata;
    private Date dtvencimento, dtemissao, dtpagamento;
    private float totalpago,totalpagar;

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getContaspagar() {
        return contaspagar;
    }

    public void setContaspagar(int contaspagar) {
        this.contaspagar = contaspagar;
    }

    public int getIdfornecedor() {
        return Idfornecedor;
    }

    public void setIdfornecedor(int Idfornecedor) {
        this.Idfornecedor = Idfornecedor;
    }

    public int getIdformapagamento() {
        return Idformapagamento;
    }

    public void setIdformapagamento(int Idformapagamento) {
        this.Idformapagamento = Idformapagamento;
    }

    public int getDuplicata() {
        return duplicata;
    }

    public void setDuplicata(int duplicata) {
        this.duplicata = duplicata;
    }

    public Date getDtvencimento() {
        return dtvencimento;
    }

    public void setDtvencimento(Date dtvencimento) {
        this.dtvencimento = dtvencimento;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public Date getDtpagamento() {
        return dtpagamento;
    }

    public void setDtpagamento(Date dtpagamento) {
        this.dtpagamento = dtpagamento;
    }

    public float getTotalpago() {
        return totalpago;
    }

    public void setTotalpago(float totalpago) {
        this.totalpago = totalpago;
    }

    public float getTotalpagar() {
        return totalpagar;
    }

    public void setTotalpagar(float totalpagar) {
        this.totalpagar = totalpagar;
    }
    
    
}
