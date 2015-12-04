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
    private String cpf;
    private String rg;
    private String telefone;
    private String rua;
    private String numero;
    private String cidade;
    private String cep;
    private String uf;
    private String email;
    private String data;
    private String obs;
    
    /*
    * Variáveis obrigatórias para construir um cliente:
    * Nome, idade, CPF e RG
    */
    public Cliente(String nome, int idade, String cpf, String rg, String cep, String cidade, String rua, String telefone, String email, String data, String uf, String obs) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.cep = cep;
        this.cidade = cidade;
        this.rua = rua;
        this.telefone = telefone;
        this.uf = uf;
        this.email = email;
        this.data = data;
        this.obs = obs;
    }
    
    public Cliente(){
        
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
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

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", rg=" + rg + ", telefone=" + telefone + ", rua=" + rua + ", numero=" + numero + ", cidade=" + cidade + ", cep=" + cep + '}'+ ", data=" + data + '}'+ ", uf=" + uf + '}'+ ", email=" + email + '}'+ ", obs=" + obs + '}';
    }
    
    
}
