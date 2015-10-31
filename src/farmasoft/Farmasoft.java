/*
 * Clase principal do programa
 */
package farmasoft;

import controller.ClienteController;

/**
 *
 * @author luizcarraro
 */
public class Farmasoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        ClienteController cc = new ClienteController();
        
        cc.criarClienteTeste();
        cc.listarClientesTeste();
        cc.buscarClienteTeste();
    } 
}
