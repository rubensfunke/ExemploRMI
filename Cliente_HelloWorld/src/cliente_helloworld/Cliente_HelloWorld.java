/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_helloworld;

import Comunica.InterfaceServidor;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author a1555960
 */
public class Cliente_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente_HelloWorld client = new Cliente_HelloWorld();
        
        
        
        try {
            InterfaceClienteImp InterfaceCliente = new InterfaceClienteImp();
            
            Registry locate = LocateRegistry.getRegistry("localhost", 8080);
            
            InterfaceServidor interServ;
            interServ = (InterfaceServidor) locate.lookup("server");
            
            interServ.chama("Chamei", InterfaceCliente);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
