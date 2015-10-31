/*
 * Classe Fornecedores.
 */
package model;

/**
 *
 * @author Luiz Henrique Sieber
 */
public class Fornecedores {
    private String nomefornecedor,representante, tipo, endereco, bairro,cidade,incricaoestadual, email, observacao;
    private int telefone,telefone2,idproduto,iduf,fax, CEP,CNPJ;

    public Fornecedores(String nomefornecedor, String endereco, String bairro, String cidade, int telefone, int telefone2, int CEP, int CNPJ) {
        this.nomefornecedor = nomefornecedor;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.telefone2 = telefone2;
        this.CEP = CEP;
        this.CNPJ = CNPJ;
    }
    
    

    public String getNomefornecedor() {
        return nomefornecedor;
    }

    public void setNomefornecedor(String nomefornecedor) {
        this.nomefornecedor = nomefornecedor;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getIncricaoestadual() {
        return incricaoestadual;
    }

    public void setIncricaoestadual(String incricaoestadual) {
        this.incricaoestadual = incricaoestadual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public int getIduf() {
        return iduf;
    }

    public void setIduf(int iduf) {
        this.iduf = iduf;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    
}
