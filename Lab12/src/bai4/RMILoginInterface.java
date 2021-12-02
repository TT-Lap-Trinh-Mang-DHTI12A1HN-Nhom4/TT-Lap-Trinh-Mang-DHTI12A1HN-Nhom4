/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author minhm
 */
import java.rmi.*;
public interface RMILoginInterface extends Remote
{
    public boolean getLogin(String user,String pass) throws RemoteException;
    
}
