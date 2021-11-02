/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import java.util.ArrayList;
import recipient.Recipient;
/**
 *
 * @author Stagiaire
 */
public class Comptoir {
    
    private ArrayList<Verre> verres;
    private Recipient tonneauRaisin, tonneauOrange;
    
    /**
     * Le comptoir aura une liste vide de verres, et un tonneau d'orange rempli de quantiteOrange verres , 
     * un tonneau de raisin rempli de quantiteRaisin verres.
     * @param quantiteOrange
     * @param quantiteRaisin 
     */

    Comptoir(int quantiteOrange, int quantiteRaisin) {
        verres = new ArrayList<Verre>();
        tonneauOrange = new Recipient (quantiteOrange, quantiteOrange);
        tonneauRaisin = new Recipient (quantiteRaisin, quantiteRaisin);
        
        

    }

    public ArrayList<Verre> getVerres() {
        return verres;
    }

    public Recipient getTonneauRaisin() {
        return tonneauRaisin;
    }

    public Recipient getTonneauOrange() {
        return tonneauOrange;
    }
    
    /**Remplir tous les verres du comptoir
     * de la boisson appropriée : raisin si le verre est à raisin , orange sinon
     */
    public void remplirTous() {
        for (int i = 0 ; i < verres.size() ; i++){
           Verre verre = verres.get(i);
           if ( verre.isEstARaisin()){
               tonneauRaisin.remplir(verre);
           }else{
               tonneauOrange.remplir(verre);
           }
           Recipient r = verre;
        }

    }

    
    
    
    
    
    
}
