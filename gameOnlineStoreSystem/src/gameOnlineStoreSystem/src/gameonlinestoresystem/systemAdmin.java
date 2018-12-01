/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameonlinestoresystem;

import java.util.Observable;

/**
 *
 * @author Dell
 */
public class systemAdmin implements Observer , View_item , item_adder{
    private static systemAdmin Admin;
    private systemAdmin(){}
    public static systemAdmin getInstanceOfAdmin()
    {
        if(Admin==null)
        {
            Admin= new systemAdmin();
        }
        return Admin;
    }

    public static systemAdmin getAdmin() {
        return Admin;
    }

    public static void setAdmin(systemAdmin Admin) {
        systemAdmin.Admin = Admin;
    }

   public void addAcc(Customer c, Vendor V, customerService cs)
   {
       if(c.getCustomerID()==null)
       {
           addAcc(c,null,null);
       }
       else if(V.getSSN()==null)
       {
            addAcc(null,V,null);
       }
       else
       {
            addAcc(null,null,cs);
       }
   }
   public void updateAcc(String vendorID,String customerID,String customerServiceID)
   {
   }
   

   public void updateItem(String itemID,Item i)
   {
       
   }
    public void approveItem(String itemID)
    {
        
    }
    public void deleteItem(String itemID)
    {
        
    }
     
    
    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viewItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addItems() {
       
    }
    
}
