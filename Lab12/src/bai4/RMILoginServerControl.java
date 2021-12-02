/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author minhm
 */
public class RMILoginServerControl {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            RMILoginImplement lp = new RMILoginImplement();
            reg.rebind("login", lp);
            System.out.println("Server is ready");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
