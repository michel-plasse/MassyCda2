package recipient.v3;

/**
 *
 *
 * @author beaad
 */
public class Recipient {

  int espaceLibre, capacite;

  /**
   *
   * Initialise le recipient avec la quantite et la capacite indiquees.
   * <br>Requiert quantite positive ou nulle capacite positive et quantite
   * &lt=capacite
   *
   *
   * @param quantite
   *
   * @param capacite
   */
  Recipient(int quantite, int capacite) {

    this.espaceLibre = capacite - quantite;
    this.capacite = capacite;

  }

  /**
   * Transfere un element de lóbjet courant dans autre
   * <br>Requiert !estVide() && !autre.estPlein() *
   *
   * @param autre
   */
  void mettreUnDans(Recipient autre) {
    espaceLibre++;
    autre.espaceLibre--;
  }

  int getQuantite() {
    return capacite - espaceLibre;
  }

  int getCapacite() {
    return capacite;
  }

  /**
   *
   * Línvariant de la classe est-il verifie
   *
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
    return capacite == espaceLibre;
  }

  boolean estPlein() {
    return espaceLibre == 0;
  }

  void remplir(Recipient autre) {
    espaceLibre = espaceLibre + autre.espaceLibre;
    autre.espaceLibre = 0;

  }

  void viderDans(Recipient autre) {
    autre.espaceLibre -= getQuantite();
    espaceLibre = capacite;
  }
}
