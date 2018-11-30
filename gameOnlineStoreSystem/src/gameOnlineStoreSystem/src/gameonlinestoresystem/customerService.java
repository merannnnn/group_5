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
public class customerService {
    public String SSN;
    ArrayList<String> Tickects = new ArrayList<String>();

    public customerService(String SSN) {
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public ArrayList<String> getTickects() {
        return Tickects;
    }

    public void setTickects(ArrayList<String> Tickects) {
        this.Tickects = Tickects;
    }
    public void closeTicket()
    {
        
    }
    public void update()
    {
        
    }
}
