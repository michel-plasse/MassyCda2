package recipient;

public class CorveeDePatates {
  // Attributs de la classe
  private Recipient tasDePatates, panier, marmite;

  /** Initialiser l'objet (constructeur) */
  public CorveeDePatates(Recipient tasDePatates, Recipient panier, Recipient marmite) {
    // this.tasDePatates : l'attribut tasDePatates
    // tasDePatates : paramètre
    this.tasDePatates = tasDePatates;
    this.panier = panier;
    this.marmite = marmite;
  }

  /** Remplir la marmite au moyen du panier. Requiert aAssezDePatates().
   */
  public void remplirMarmite() {
    assert aAssezDePatates() : "pas assez depatates pour remplir la marmite";
    while (!marmite.estPlein()) {
      if (panier.estVide()) {
        tasDePatates.remplir(panier);
      }
      panier.mettreUnDans(marmite);
    }
  }

  /** Y a-t-il assez de patates dans le panier et le tas pour
   * remplir la marmite ?
   * La condition est un peu compliquée : si vous avez envie
   * de réfléchir. A dédaut, disons que ça marche toujours (bien sûr,
   * c'est faux)
   * @return 
   */
  public boolean aAssezDePatates() {
    return true;
  }
  
}