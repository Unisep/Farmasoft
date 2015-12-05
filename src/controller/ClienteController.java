/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Cliente;

/**
 *
 * @author luizcarraro
 */
public class ClienteController {
    public boolean criarClienteTeste(String nome, int idade, String cpf, String rg,String cep, String cidade, String rua, String telefone, String email, String data, String uf, String obs) {
        DAOController db = DAOController.getInstance();
        
        Cliente cliente = new Cliente(nome,idade,cpf,rg,cep, cidade, rua, telefone, email, data, uf, obs);
        
        db.gravar(cliente);
        return true; 
    }
    
    public void listarClientesTeste() {
        DAOController db = DAOController.getInstance();
        
        // Para listar todos os objetos de um tipo, basta pesquisar pelo objeto vazio
        List<Object> resultado = db.buscar(new Cliente());
        
        System.out.print("\n\n\nLista todos\n");
        for (Object cliente : resultado) {
            System.out.println(cliente.toString());
        }
    }
    
    public void buscarClienteTeste(){ 
        DAOController db = DAOController.getInstance();
        
        //Para buscar por um dado específico, como por exemplo, o nome: 
        String nome = "Juca";
        
        Cliente busca = new Cliente();
        busca.setNome(nome);
        
        List<Object> resultado = db.buscar(busca);
        
       
        System.out.print("\n\n\nBusca por nome: \n");
        for (Object cliente : resultado) {
           System.out.println(cliente.toString());
        }
    }   
    
    public void Excluir(String nome, int idade, String cpf, String rg,String cep, String cidade, String rua, String telefone, String email, String data, String uf, String obs) {
        DAOController db = DAOController.getInstance();
        
        Cliente cliente = new Cliente(nome,idade,cpf,rg,cep, cidade, rua, telefone, email, data, uf, obs);
        
        db.apagar(cliente);

    }
    
}
