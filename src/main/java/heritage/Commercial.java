/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

/**
 *
 * @author kamal
 */
public class Commercial extends Salarie{
    private double commission;
    
    public Commercial(double salaireDeBase){
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
        return super.getSalaire(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
jjggk