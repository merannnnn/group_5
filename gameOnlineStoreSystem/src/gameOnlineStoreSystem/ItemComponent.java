/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameonlinestoresystem;

/**
 *
 * @author meran
 */
interface ItemComponent {
    public void rateItem(Item i, int rate);
    public void viewItemsDetails(Item i,Category c);
    public void rate(Item i);
    
}
