package abstraites;

import recipient.Recipient;

/**
 *
 * @author michel
 */
public class Verre extends Recipient implements Comparable<Verre> {
  private boolean estARaisin;

  public Verre(int quantite, int capacite, boolean estARaisin) {
    super(quantite, capacite);
    this.estARaisin = estARaisin;
  }
  
  

  @Override
  public int compareTo(Verre autre) {
    int result = 0;
    if (getCapacite() < autre.getCapacite()) {
      result = -1;
    } else if (getCapacite() > autre.getCapacite()) {
      result = 1;
    }
    return result;
  }
  
  
}
