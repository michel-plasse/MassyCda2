package abstraites;

import recipient.Recipient;

public class CorveeDePatates extends Iteration {

    private Recipient tasDePatates, panier, marmite;

    public CorveeDePatates(Recipient tasDePatates, Recipient panier, Recipient marmite) {
        this.tasDePatates = tasDePatates;
        this.panier = panier;
        this.marmite = marmite;
    }

    public Recipient getTas() {
        return tasDePatates;
    }

    public Recipient getPanier() {
        return panier;
    }

    public Recipient getPatates() {
        return marmite;
    }

    @Override
    public void commencer() {

    }

    @Override
    public void avancer() {
        if (panier.estVide()) {
            tasDePatates.remplir(panier);
        } else {
            panier.mettreUnDans(marmite);
        }
    }

    @Override
    public boolean estTermine() {
        return marmite.estPlein();
    }

    @Override
    public String toString() {
        return tasDePatates.getQuantite() + "/" + tasDePatates.getCapacite() + " " + panier.getQuantite() + "/" + panier.getCapacite() + " " + marmite.getQuantite() + "/" + marmite.getCapacite();
    }

    
}
