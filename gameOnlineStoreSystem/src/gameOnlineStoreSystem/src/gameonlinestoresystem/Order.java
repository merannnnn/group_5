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
public class Order implements OrderState{
    public String OrderID;
    public String OrderStatus;

    public Order(String OrderID, String OrderStatus) {
        this.OrderID = OrderID;
        this.OrderStatus = OrderStatus;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }
    public void Order(String OrderID, String OrderStatus )
    {
        
    }
    public void trackOrder(String OrderID)
    {
        
    }
    public void UpdateStatus(String Status)
    {
        
    }
    
    
}
