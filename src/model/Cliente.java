/*
 * Classe para representar o modelo Cliente.
 */
package model;

/**
 *
 * @author luizcarraro
 */
public class Cliente {
    private String nome;
    private int idade;
    private String CPF;
    private String rg;
    private String telefone;
    private String rua;
    private String numero;
    private String cidade;
    private String cep;
    
    /*
    * Variáveis obrigatórias para construir um cliente:
    * Nome, idade, CPF e RG
    */
    public Cliente(String nome, int idade, String CPF, String rg) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
