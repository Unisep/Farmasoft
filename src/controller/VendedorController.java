/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import model.Vendedor;
/**
 *
 * @author Felipe
 */
public class VendedorController {
    public boolean criarVendedor(String nome, String datacontratacao, String CPF, String rg, String endereco, String cidade, String bairro, String cep, String uf, String telefone, String email) {
        DAOController db = DAOController.getInstance();
        
        Vendedor vendedor = new Vendedor( nome,  datacontratacao,  CPF,  rg,  endereco,  cidade,  bairro,  cep,  uf,  telefone, email);
        
        db.gravar(vendedor);
        return true; 
    }
    
    public void listarVendedor() {
        DAOController db = DAOController.getInstance();
        
        // Para listar todos os objetos de um tipo, basta pesquisar pelo objeto vazio
        List<Object> resultado = db.buscar(new Vendedor());
        
        System.out.print("\n\n\nLista todos\n");
        for (Object cliente : resultado) {
            System.out.println(cliente.toString());
        }
    }
    
    public void buscarClienteTeste(){ 
        DAOController db = DAOController.getInstance();
        
        //Para buscar por um dado específico, como por exemplo, o nome: 
        String nome = "Juca";
        
        Vendedor busca = new Vendedor();
        busca.setNome(nome);
        
        List<Object> resultado = db.buscar(busca);
        
       
        System.out.print("\n\n\nBusca por nome: \n");
        for (Object cliente : resultado) {
            System.out.println(cliente.toString());
        }
    }   
    
    public void Excluir(String nome, String datacontratacao, String CPF, String rg, String endereco, String cidade, String bairro, String cep, String uf, String telefone, String email) {
        DAOController db = DAOController.getInstance();
        
        Vendedor cliente = new Vendedor( nome,  datacontratacao,  CPF,  rg,  endereco,  cidade,  bairro,  cep,  uf,  telefone, email);
        
        db.apagar(cliente);

    }
}
