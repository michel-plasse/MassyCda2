/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritage;

/**
 *
 * @author thoma
 */
public class Commercial extends Salarie {

    protected double commission;

    public Commercial(double salaireDeBase) {
        super(salaireDeBase);
    }


    public void setCommission(double montant){
        this.commission = montant;
    }
    
    @Override
    public double getSalaire(){
        return super.getSalaire() + commission;
    }
    
    public double getCommission(){
        return commission;
    }
}