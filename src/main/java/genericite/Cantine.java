/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericite;

import recipient.Recipient;

public class Cantine {

    private Recipient bac, cuisine;
    private int assiettes;

    Cantine(int assiettes, Recipient bac, Recipient cuisine) {
        this.assiettes = assiettes;
        this.bac = bac;
        this.cuisine = cuisine;
    }

    private Recipient usager = new Recipient(0, assiettes);

    void servirTous() {
        for (int i = assiettes; i <= cuisine.getQuantite(); i++) {
            if (bac.estVide()) {
                cuisine.remplir(bac);
            }
            bac.remplir(usager);
        }

    }

}
