package heritage;

import recipient.Recipient;

public class Verre extends Recipient {
  private boolean estARaisin;
  
  /** 
   * Crée un verre de quantite et capacité données, en indiquant s'il est à raisin ou pas.
   * @param quantite
   * @param capacite
   * @param estARaisin 
   */
  public Verre(int quantite, int capacite, boolean estARaisin) {
    // Appelle le constructeur (l'initialiseur) du parent
    super(quantite, capacite);
    this.estARaisin = estARaisin;
  }

  public boolean isEstARaisin() {
    return estARaisin;
  }
  
}
