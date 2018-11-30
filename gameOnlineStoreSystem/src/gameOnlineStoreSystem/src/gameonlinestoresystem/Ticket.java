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
public class Ticket {
    public int ID;
    public String Description;

    public Ticket(int ID, String Description) {
        this.ID = ID;
        this.Description = Description;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public void addTickects(String Description)
    {
        
    }
    public void getTicket(String ID)
    {
        
    }
    public void retriveAll(){
        
    }
}
