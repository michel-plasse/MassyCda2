package demo;

import java.util.ArrayList;

/**
 * Echantillon de valeurs, pourvu d'une taille, un minimum, une moyenne,
 * un maximum.
 * <br>L'implémentation stocke le résumé des données, pas leur liste.
 * @author michel
 */
public class Echantillon {
  // Après l'instanciation, les nombres valent la valeur par défaut
  // d'un nombre en Java, à savoir 0 (entiers) ou 0.0 (nombres décimaux).
  private int taille;
  private ArrayList<Double> valeurs;

  public Echantillon(){
      valeurs = new ArrayList<>();
  }
  /**
   * Nombre d'éléments de l'échantillon
   * @return  nb d'elements dans l'echantillon
   */
  public int getTaille() {
    return valeurs.size();
  }

  /**
   * Valeur minimum. Requiert getTaille() > 0
   * @return la valeur minimum dans l'Echantillon
   */
  public double getMinimum() {
    // Le require
    assert taille > 0;
    // Le code
    double result = valeurs.get(0);
    for(int i=1; i< valeurs.size();i++)
    {
        if(valeurs.get(i)<result);
        {
            result = valeurs.get(i);
        }
    }
    return result;
  }

  /**
   * Valeur moyenne. Requiert getTaille() > 0
   * @return la moyenne des elements de l'echantillon
   */
  public double getMoyenne() {
    // Le require
    assert taille > 0;
    // Le code
    double result=0;
    for(int i =0; i< valeurs.size();i++)
    {
        result+=valeurs.get(i);
    }
    return result/valeurs.size();
  }

  /**
   * Valeur maximum. Requiert getTaille() > 0
   * @return  la valeur maximum dans l'Echantillon
   */
  public double getMaximum() {
    // Le require
    assert taille > 0;
    // Le code
    double result = valeurs.get(0);
    for(int i=1; i< valeurs.size();i++)
    {
        if(valeurs.get(i)>result);
        {
            result = valeurs.get(i);
        }
    }
    return result;
  }

  /**
   * Ajouter une valeur à l'échantillon. Garantit que getTaille() est
   * incrémentée de 1.
   * @param valeur: valeur a ajouter
   */
  public void ajouter(double valeur) {
    valeurs.add(valeur);
    // les invariants doivent etre respectes
    assert estInvariantOk();
  }

  /**
   * Conditions toujours vraies
   * @return true si les nvariants sont ok
   */
  public boolean estInvariantOk() {
    assert getTaille() >= 0 : "taille négative";
    assert getTaille() == 0 || getMinimum() <= getMoyenne() : "minimum > moyenne";
    assert getTaille() == 0 || getMoyenne() <= getMaximum() : "moyenne > maximum";
    return true;
  }

}
