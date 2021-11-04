package heritage;

/**
 *
 * @author michel
 */
public class Commercial extends Salarie {
  private double commission;
  
  public Commercial(double salaireDeBase) {
    super(salaireDeBase);
  }

  public double getCommission() {
    return commission;
  }

  public void setCommission(double commission) {
    this.commission = commission;
  }

  @Override
  public double getSalaire() {
    return super.getSalaire() + commission;
  }
  
  
}
