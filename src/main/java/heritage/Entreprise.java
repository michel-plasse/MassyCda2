package heritage;

import java.util.ArrayList;

public class Entreprise {

  ArrayList<Salarie> salaries;

  /**
   * Intialise une entreprise sans salariés (laliste sera vide)
   */
  public Entreprise() {
    salaries = new ArrayList<Salarie>();
  }

  public ArrayList<Salarie> getSalaries() {
    return salaries;
  }

  public double getMasseSalariale() {
    double result = 0;
    for (int i = 0; i < salaries.size(); i++) {
      result += salaries.get(i).getSalaire();
    }
    return result;
  }

}
