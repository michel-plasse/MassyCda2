package heritage;

import java.util.ArrayList;
import recipient.Recipient;

public class Comptoir {
  private ArrayList<Verre> verres;
  private Recipient tonneauRaisin, tonneauOrange;

  /**
   * Le comptoir aura une liste vide de verres, un tonneau d'orange rempli de quantiteOrange verres, et un tonneau de raisin rempli de quantiteRaisin verres.
   * @param quantiteOrange
   * @param quantiteRaisin 
   */
  Comptoir(int quantiteOrange, int quantiteRaisin) {
    // Liste de verres vide
    verres = new ArrayList<Verre>();
    tonneauOrange = new Recipient(quantiteOrange, quantiteOrange);
    tonneauRaisin = new Recipient(quantiteRaisin, quantiteRaisin);
  }

  public ArrayList<Verre> getVerres() {
    return verres;
  }

  public Recipient getTonneauRaisin() {
    return tonneauRaisin;
  }

  public Recipient getTonneauOrange() {
    return tonneauOrange;
  }

  public void remplirTous() {
    for (int i = 0 ; i < verres.size() ; i++) {
      Verre verre = verres.get(i);
      if (verre.isEstARaisin()) {
        tonneauRaisin.remplir(verre);
      } else {
        tonneauOrange.remplir(verre);
      }
      Recipient r = verre;
    }
  }


}
