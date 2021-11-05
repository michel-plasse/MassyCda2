/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraites;

import recipient.Recipient;

/**
 *
 * @author Stagiaire
 */
public class Verre extends Recipient implements Comparable<Verre> {

    private boolean estARaisin;

    public Verre(int quantite, int capacite, boolean estARaisin) {
        super(quantite, capacite);
        this.estARaisin = estARaisin;
    }

    @Override
    public int compareTo(Verre autre) {
        int result = 0;
        if (getCapacite() < autre.getCapacite()) {
            result = -1;
        } else if (getCapacite() > autre.getCapacite()) {
            result = 1;
        }
        return result;
    }

}
