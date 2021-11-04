
package heritage;

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

    /**
     * On redéfinit la méthode getSalaire, car pour un commercial, nous
     * souhaitons que le salaire contienne la commission. Override = passer
     * outre
     *
     * @return
     */
    @Override
    public double getSalaire() {
        return super.getSalaire() + commission;
    }

}
