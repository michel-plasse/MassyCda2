package recipient;

/**
 *
 * @author michel
 */
public class Recipient {
  // Etat de l'objet
  private int quantite, capacite;

  /**
   * Initialise le récipient avec la quantité et la capacité indiquées.
   * <br>Requiert quantite positive ou nulle, capacite positive
   * et quantite &lt;= capacite
   *
   * @param quantite
   * @param capacite
   */
  public Recipient(int quantite, int capacite) {
    this.quantite = quantite;
    this.capacite = capacite;
  }

  /**
   * Transfère un élément de l'objet courant dans autre.
   * <br>Requiert !estVide() && !autre.estPlein()
   *
   * @param autre
   */
  public void mettreUnDans(Recipient autre) {
    quantite = quantite - 1;
    autre.quantite = autre.quantite + 1;
  }

  public int getQuantite() {
    return quantite;
  }

  public int getCapacite() {
    return capacite;
  }

  /**
   * L'invariant de la classe est-il vérifié ?
   */
  public boolean invariantEstOk() {
    assert getQuantite() >= 0;
    assert getEspaceLibre() >= 0;
    assert getCapacite() > 0;
    assert (getCapacite() == getQuantite() + getEspaceLibre());
    assert (estVide() == (getQuantite() == 0));
    assert (estPlein() == (getEspaceLibre() == 0));
    return true;
  }

  public int getEspaceLibre() {
    return capacite - quantite;
  }

  public boolean estVide() {
    return quantite == 0;
  }

  public boolean estPlein() {
    return quantite == capacite;
  }

  public void remplir(Recipient autre) {
    quantite -= autre.getEspaceLibre();
    autre.quantite = autre.capacite;
  }

  public void viderDans(Recipient autre) {
    autre.quantite += quantite;
    quantite = 0;
  }
}
