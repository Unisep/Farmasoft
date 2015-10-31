/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import java.util.List;

/**
 *
 * @author carraro
 */
public final class DAOController {
    private ObjectContainer banco;
    private static DAOController instance;
    
    private DAOController(){
        banco = Db4o.openFile("bancodedados.yap");
    }
    public void rollback(){
        banco.rollback();
    }
    
    public void gravar(Object objeto){
        banco.set(objeto);
        banco.commit();
    }
    
    public void apagar(Object objeto){
        banco.delete(objeto);
    }
    
    public List<Object> buscar(Object objeto){
        List lista = banco.get(objeto);
        return lista;
    }
    
    public int nObjetos(Object o){
        List lista = banco.get(o);
        int quantia = lista.size();
        return quantia;
    }
    
    public static DAOController getInstance(){
        if(instance == null) {
            instance = new DAOController();
        }
        return instance;
    }
}
