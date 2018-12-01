/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameonlinestoresystem;

/**
 *
 * @author Dell
 */
import java.util.*;
public class Vendor implements Observer {
    public String SSN;
    ArrayList<Item>items=new ArrayList<Item>();

    public Vendor(String SSN) {
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public void notifyCustomerService(String custID,String msg)
    {
        
    }
    public void addItem(String itemID)
    {
        item_adder add = systemAdmin.getInstanceOfAdmin();
        add.addItems();
    }
    public void updateItem(String itemID)
    {
    }
    public void deleteItem(String itemID)
    {
        
    }
    public void viewItems(String itemID)
    {
        View_item viewer = systemAdmin.getInstanceOfAdmin();
        viewer.viewItems();
    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
