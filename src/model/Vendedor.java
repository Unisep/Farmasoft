/*
 * Classe para representar o modelo Vendedor
 */
package model;

import java.util.Date;

/**
 *
 * @author Felipe
 */
public class Vendedor {
    private String nome;
    private Date datacontratacao;
    private String CPF;
    private String rg;
    private String endereco;
    private String cidade;
    private String bairro;
    private String cep;
    private String uf;
    private String numero;
    private String telefone;
    private String email;

    public Vendedor(String nome, Date datacontratacao, String CPF, String rg) {
        this.nome = nome;
        this.datacontratacao = datacontratacao;
        this.CPF = CPF;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatacontratacao() {
        return datacontratacao;
    }

    public void setDatacontratacao(Date datacontratacao) {
        this.datacontratacao = datacontratacao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
}
