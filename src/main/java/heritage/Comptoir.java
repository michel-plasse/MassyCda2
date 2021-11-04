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
     * Le comptoir aura une liste vide de verres, un tonneau d'Orange rempli de
     * quantiteOrange verre et un tonneau de raisin rempli de quantiteRaisin
     * verre.
     *
     * @param quantiteOrange
     * @param quantiteRaisin
     */
    Comptoir(int quantiteOrange, int quantiteRaisin) {
        // créé un nouveau récipient pour chaque tonneau où la quantite = la
        // capacité
        tonneauRaisin = new Recipient(quantiteRaisin, quantiteRaisin);
        tonneauOrange = new Recipient(quantiteOrange, quantiteOrange);
        // crée une liste vide de verres
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

    /**
     * Remplit tous les verres du comptoir avec la boisson appropriée. Raisin si
     * le verre est à raisin, sinon Orange.
     */
    public void remplirTous() {
        for (int i = 0; i < getVerres().size(); i++) {
            Verre verre = verres.get(i);
            if (verre.estARaisin()) {
                tonneauRaisin.remplir(verre);
            } else {
                tonneauOrange.remplir(verre);
            }
        }
    }
}
