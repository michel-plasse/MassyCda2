/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesAbstraites;

import recipient.v3.Recipient;

/**
 *
 * @author thoma
 */
public class CorveeDePatates extends Iteration {

    private Recipient tas, panier, marmite;

    public CorveeDePatates(Recipient tas, Recipient panier, Recipient marmite) {
        this.tas = tas;
        this.panier = panier;
        this.marmite = marmite;
    }

    public Recipient getTas() {
        return tas;
    }

    public Recipient getPanier() {
        return panier;
    }

    public Recipient getMarmite() {
        return marmite;
    }

    @Override
    public void commencer() {
        assert aAssezDePatates() : "pas assez depatates pour remplir la marmite";
    }

    @Override
    public void avancer() {
        if (panier.estVide()) {
            tas.remplir(panier);
        } else {
        panier.mettreUnDans(marmite);
        }
    }

    @Override
    public boolean estTermine() {
        return marmite.estPlein();
    }

    /**
     * Y a-t-il assez de patates dans le panier et le tas pour remplir la
     * marmite ? La condition est un peu compliquée : si vous avez envie de
     * réfléchir. A dédaut, disons que ça marche toujours (bien sûr, c'est faux)
     *
     * @return
     */
    public boolean aAssezDePatates() {
        return (panier.getQuantite() + tas.getQuantite()
                >= marmite.getEspaceLibre());
    }

    @Override
    public String toString() {
        return tas.getQuantite() + "/" + tas.getCapacite()
                +" " + panier.getQuantite() + "/" + panier.getCapacite()
                +" " + marmite.getQuantite()+ "/" + marmite.getCapacite();
    }
    
    
}
