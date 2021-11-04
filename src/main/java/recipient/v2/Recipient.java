package recipient.v2;

/**
 *
 * @author michel
 */
public class Recipient {

  // Etat de l'objet
  int quantite, espaceLibre;

  /**
   * Initialise le récipient avec la quantité et la capacité indiquées.
   * <br>Requiert quantite positive ou nulle, capacite positive et quantite
   * &lt;= capacite
   *
   * @param quantite
   * @param capacite
   */
  Recipient(int quantite, int capacite) {
    this.quantite = quantite;
    this.espaceLibre = capacite - quantite;
  }

  /**
   * Transfère un élément de l'objet courant dans autre.
   * <br>Requiert !estVide() && !autre.estPlein()
   *
   * @param autre
   */
  void mettreUnDans(Recipient autre) {
    quantite--;
    espaceLibre++;
    autre.quantite++;
    autre.espaceLibre--;
  }

  int getQuantite() {
    return quantite;
  }

  int getCapacite() {
    return quantite + espaceLibre;
  }

  /**
   * L'invariant de la classe est-il vérifié ?
   */
  boolean invariantEstOk() {
    return getQuantite() >= 0
            && getEspaceLibre() >= 0
            && getCapacite() > 0
            && (getCapacite() == getQuantite() + getEspaceLibre())
            && (estVide() == (getQuantite() == 0))
            && (estPlein() == (getEspaceLibre() == 0));
  }

  int getEspaceLibre() {
    return espaceLibre;
  }

  boolean estVide() {
    return quantite == 0;
  }

  boolean estPlein() {
    return espaceLibre == 0;
  }

  void remplir(Recipient autre) {
    quantite -= autre.espaceLibre;
    espaceLibre += autre.espaceLibre;
    autre.quantite += autre.espaceLibre;
    autre.espaceLibre = 0;
  }

  void viderDans(Recipient autre) {
    autre.quantite += quantite;
    autre.espaceLibre -= quantite;
    espaceLibre += quantite;
    quantite = 0;
  }
}
