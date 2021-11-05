package genericite;

import java.util.ArrayList;

/**
 * Echantillon de valeurs, pourvu d'une taille, un minimum, une moyenne, un
 * maximum.
 * <br>L'implémentation stocke le résumé des données, pas leur liste.
 *
 * @author michel
 */
public class Echantillon {

  // Après l'instanciation, les nombres valent la valeur par défaut
  // d'un nombre en Java, à savoir 0 (entiers) ou 0.0 (nombres décimaux).
  private ArrayList<Double> valeurs;

  public Echantillon() {
    // Initialiser valeurs à uneliste vide
    valeurs = new ArrayList<Double>();
  }
  
  /**
   * Nombre d'éléments de l'échantillon
   */
  public int getTaille() {
    return valeurs.size();
  }

  /**
   * Valeur minimum. Requiert getTaille() > 0
   */
  public double getMinimum() {
    // Le require
    assert getTaille() > 0;
    // Le code
    double result = valeurs.get(0);
    for (int i = 1; i < valeurs.size(); i++) {
      if (valeurs.get(i) < result) {
        result = valeurs.get(i);
      }
    }
    return result;
  }

  /**
   * Valeur moyenne. Requiert getTaille() > 0
   */
  public double getMoyenne() {
    // Le require
    assert getTaille() > 0;
    // Le code
    double result = 0;
    for (int i = 0; i < valeurs.size(); i++) {
      result += valeurs.get(i);
    }
    return result / valeurs.size();
  }

  /**
   * Valeur maximum. Requiert getTaille() > 0
   */
  public double getMaximum() {
    // Le require
    assert getTaille() > 0;
    // Le code
    double result = valeurs.get(0);
    for (int i = 1; i < valeurs.size(); i++) {
      if (valeurs.get(i) > result) {
        result = valeurs.get(i);
      }
    }
    return result;
  }

  /**
   * Ajouter une valeur à l'échantillon. Garantit que getTaille() est
   * incrémentée de 1.
   */
  public void ajouter(double valeur) {
    valeurs.add(valeur);
    assert estInvariantOk();
  }

  /**
   * Conditions toujours vraies
   */
  public boolean estInvariantOk() {
    assert getTaille() >= 0 : "taille négative";
    assert getTaille() == 0 || getMinimum() <= getMoyenne() : "minimum > moyenne";
    assert getTaille() == 0 || getMoyenne() <= getMaximum() : "moyenne > maximum";
    return true;
  }

}
