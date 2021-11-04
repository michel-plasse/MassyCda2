package heritage;

import java.util.ArrayList;

public class DirecteurCommercial extends Commercial {
  private ArrayList<Commercial> commerciaux;
  
  public DirecteurCommercial(double salaireDeBase) {
    super(salaireDeBase);
  }

  public ArrayList<Commercial> getCommerciaux() {
    return commerciaux;
  }

  @Override
  public double getSalaire() {
    return super.getSalaire();
  }
  
  
}
