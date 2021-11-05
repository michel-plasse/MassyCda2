package genericite;

import java.util.ArrayList;
import recipient.Recipient;

/**
 *
 * @author michel
 */
public class Cantine {
  private ArrayList<Recipient> assiettes;
  private Recipient bac, cuisine;

  public ArrayList<Recipient> getAssiettes() {
    return assiettes;
  }

  public Recipient getBac() {
    return bac;
  }

  public Recipient getCuisine() {
    return cuisine;
  }
  
  /**
   * Requiert nbAssiettes &gt;= 0 ; bac != null ; cuisine != null
   * @param nbAssiettes
   * @param bac
   * @param cuisine 
   */
  public Cantine(int nbAssiettes, Recipient bac, Recipient cuisine) {
    assert nbAssiettes >= 0;
    assert bac != null;
    assert cuisine != null;
    assiettes = new ArrayList<Recipient>();
    for (int i = 0 ; i < nbAssiettes ; i++) {
      assiettes.add(new Recipient(0, 1));
    }
    this.bac = bac;
    this.cuisine = cuisine;
  }
   
  /** Servir toutes les assiettes.
   * Requiert peutServirTous()
   */
  public void servirTous() {
    assert peutServirTous();
    for (int i = 0 ; i < assiettes.size() ; i++) {
      if (bac.estVide()) {
        cuisine.remplir(bac);
      }
      bac.remplir(assiettes.get(i));
    }
  }
  
  /** Servir toutes les assiettes, tant qu'il reste à servir. */
  public void servirLePlusPossible() {
    for (int i = 0 ; i < assiettes.size() && resteAServir() ; i++) {
      if (bac.estVide()) {
        if (cuisine.getQuantite() >= bac.getCapacite()) {
          cuisine.remplir(bac);
        } else {
          cuisine.viderDans(bac);
        }
      }
      bac.remplir(assiettes.get(i));
    }
  }

  /** Peut-on servir l'assiette courante ? */
  public boolean resteAServir() {
    return !bac.estVide() || !cuisine.estVide();
  }

  /** Le bac et la cuisine ont-ils assez pour servir toutes les assiettes ? */
  public boolean peutServirTous() {
    return bac.getQuantite() + cuisine.getQuantite() >= assiettes.size();
  }
  
}
