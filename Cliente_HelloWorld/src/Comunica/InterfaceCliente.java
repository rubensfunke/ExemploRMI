/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comunica;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author a1555960
 */
public interface InterfaceCliente extends Remote{
    
    public void echo(String mensagem) throws RemoteException;
    
}
