/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameonlinestoresystem;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Dell
 */
public class Customer implements Observer,paymentMethod{
    public String customerID;
    

    public Customer(String customerID) {
        this.customerID = customerID;
       
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    
    public void viewItems()
    {
        View_item viewer = systemAdmin.getInstanceOfAdmin();
        viewer.viewItems();
    }
    public void createTicket(String customerID,String Description)
    {
        
        
    }
    
    public void update()
    {
        
    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
