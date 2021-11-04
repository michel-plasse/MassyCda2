
package heritage;

import java.util.ArrayList;
import recipient.Recipient;

/**
 *
 * @author Florian
 */
public class Comptoir {
    private ArrayList<Verre> verres;
    private Recipient tonneauRaisin,tonneauOrange;

    /**Le comptoir aura une liste vide de Verres,
     * un tonneau d'orange rempli de quantiteOrange verres et un 
     * tonneau de raisin rempli de quantiteRaisin verres.
     * 
     * @param quantiteOrange
     * @param quantiteRaisin 
     */
    public Comptoir(int quantiteOrange, int quantiteRaisin) {
        tonneauOrange = new Recipient(quantiteOrange,quantiteOrange);
        tonneauRaisin = new Recipient(quantiteRaisin,quantiteRaisin);
        verres = new ArrayList<Verre>();
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

    public void RemplirTous() {
        for(int i=0;i<verres.size();i++){
            if (verres.get(i).isEstARaisin()){
                tonneauRaisin.remplir(verres.get(i));
            }
            else{
                tonneauOrange.remplir(verres.get(i));
            }
        }
    }

   
}
