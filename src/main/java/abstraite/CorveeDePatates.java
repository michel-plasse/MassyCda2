
package abstraite;

import recipient.Recipient;

/**
 *
 * @author Florian
 */
public class CorveeDePatates extends Iteration{
    
    private Recipient tas,panier,marmite;

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
    }

    @Override
    public void avancer() {
        assert ! estTerminé();
        if (panier.estVide()){
            tas.remplir(panier);
        }else{
            panier.mettreUnDans(marmite);
        }
    }

    @Override
    public boolean estTerminé() {
        return marmite.estPlein();
    }

    @Override
    public String toString() {
        return  tas.getQuantite() + "/" + tas.getCapacite() +" " + panier.getQuantite()+ "/" 
                + panier.getCapacite()+ " " + marmite.getQuantite() + "/" + marmite.getCapacite();
    }
    
    
}
