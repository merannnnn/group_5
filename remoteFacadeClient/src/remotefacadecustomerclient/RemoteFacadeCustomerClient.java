/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotefacadecustomerclient;

/**
 *
 * @author Dell
 */
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class RemoteFacadeCustomerClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws RemoteException,NotBoundException  {
        // TODO code application logic here
          // Connect to RMI Registry
        Registry reg = LocateRegistry.getRegistry(1099);
    }
    
}
