/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_helloworld;

import Comunica.InterfaceCliente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author a1555960
 */
public class InterfaceClienteImp extends UnicastRemoteObject implements InterfaceCliente{
    
    protected InterfaceClienteImp() throws RemoteException{
        super();
    }

    @Override
    public void echo(String mensagem) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.") ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
