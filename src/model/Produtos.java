/*
 * Classe para representar o modelo de produtos
 */
package model;

/**
 * @author Maike
 */
public class Produtos {

    private String produto;
    private String qtdproduto;
    private String fornecedor;
    private String descricao;
    private float vlrcusto;
    private float vlrvenda;

    public Produtos(String produto, String qtdproduto, String fornecedor, String descricao, float vlrcusto, float vlrvenda) {
        this.produto = produto;
        this.qtdproduto = qtdproduto;
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.vlrcusto = vlrcusto;
        this.vlrvenda = vlrvenda;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQtdproduto() {
        return qtdproduto;
    }

    public void setQtdproduto(String qtdproduto) {
        this.qtdproduto = qtdproduto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getVlrcusto() {
        return vlrcusto;
    }

    public void setVlrcusto(float vlrcusto) {
        this.vlrcusto = vlrcusto;
    }

    public float getVlrvenda() {
        return vlrvenda;
    }

    public void setVlrvenda(float vlrvenda) {
        this.vlrvenda = vlrvenda;
    }

}
