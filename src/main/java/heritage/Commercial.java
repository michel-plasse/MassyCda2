
package heritage;

/**
 *
 * @author Florian
 */
public class Commercial extends Salarie{
    
    private double commission;

    public Commercial(double salaireDeBase) {
        super(salaireDeBase);
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    @Override
    public double getSalaire() {
        return super.getSalaire()+commission; 
    }
    
    
}
