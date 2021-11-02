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
public class Verre extends Recipient{
    private boolean estARaisin;// Si TRUE donc c'est un raisin sinonn orange 
    /**
     * Crée un verre de quantite et capacité données , en indiquant s'il est à raisin ou pas .
     * @param quantite
     * @param capacite
     * @param estARaisin 
     */
    
    public Verre(int quantite, int capacite, boolean estARaisin) {
        //Appelle le constructeur (l'initialisateur) du parent
        super(quantite, capacite);
        this.estARaisin = estARaisin;
    }

    public boolean isEstARaisin() {
        return estARaisin;
    }
    
}
