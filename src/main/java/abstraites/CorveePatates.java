package abstraites;

import recipient.Recipient;

/**
 *
 * @author michel
 */
public class CorveePatates extends Iteration {

  private final Recipient tas, panier, marmite;

  public CorveePatates(Recipient tas, Recipient panier, Recipient marmite) {
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

  @Override
  public String toString() {
    return tas.getQuantite() + "/" + tas.getCapacite()
            + "  " + panier.getQuantite() + "/" + panier.getCapacite()
            + "  " + marmite.getQuantite() + "/" + marmite.getCapacite();
  }

}
