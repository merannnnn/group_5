/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameonlinestoresystem;

/**
 *
 * @author shebo
 */
public class payPal implements paymentMethod{
    private String accountNumber;
    private float amount;
    private boolean isPayed;
    private float balance;
    @Override
    public void pay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean check()
    {
        return true;
    }
}
