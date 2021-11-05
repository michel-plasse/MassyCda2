package demo;

/**
 *
 * @author michel
 */
public class LecteurDouble {
  private Double value;

  /** 
   * Prend la saisie de l'utilisateur.
   * Requiert string != null
   * @param string 
   */
  public void setInput(String string) {
    assert string != null;
    try {
      value = Double.parseDouble(string);
    } catch (NumberFormatException exc) {
      value = null;
    }
  }

  public Double getValue() {
    return value;
  }
  
}
