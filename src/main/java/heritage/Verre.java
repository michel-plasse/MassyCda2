/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import recipient.Recipient;


/**
 *
 * @author Stagiaire
 */
public class Verre extends Recipient {
    
    public boolean estARaisin;
    
    /**
     * Crée un verre de quantité et de capacité données, en indiquant via un
     * boolean s'il est à raisin ou pas.
     * @param quantite
     * @param capacite
     * @param estARaisin 
     */
    public Verre(int quantite, int capacite, boolean estARaisin) {
        // On appelle le constructeur (initialisateur) du parent
        super(quantite, capacite);
        this.estARaisin = estARaisin;
    }

  

    

    public boolean estARaisin() {
        return estARaisin;
    }
    
}
