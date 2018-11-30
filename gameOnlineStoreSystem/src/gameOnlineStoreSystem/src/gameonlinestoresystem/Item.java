package gameonlinestoresystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Item {
    public String itemID;
    public int rate;

    public Item(String itemID, int rate) {
        this.itemID = itemID;
        this.rate = rate;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    public void rateItem()
    {
    }
    public void setOverAllRate()
    {
        
    }
    public void viewItemsDetails()
    {
        
    }
}
