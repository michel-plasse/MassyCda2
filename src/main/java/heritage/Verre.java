/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritage;

import recipient.v3.Recipient;

/**
 * 
 * @author thoma
 */
public class Verre extends Recipient {
    
    private boolean estARaisin;
    /**
     * Crée un Verre(super=Recipient) 
     * @param quantite
     * @param capacite
     * @param estARaisin 
     */
    public Verre(int quantite, int capacite, boolean estARaisin){
        super(quantite,capacite);
        this.estARaisin = estARaisin;
    }
    
    public boolean getEstARaisin()
    {
        return this.estARaisin;
    }
}
