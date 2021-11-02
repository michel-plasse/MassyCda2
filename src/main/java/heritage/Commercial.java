package heritage;

/**
 *
 * @author Stagiaire
 */
public class Commercial extends Salarie {
    
    private double commission;
    
    public Commercial(double salaireDeBase) {
        super(salaireDeBase);
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double comission) {
        this.commission = comission;
    }

    @Override
    public double getSalaire() {
        return super.getSalaire() + commission; 
    }
    
}
