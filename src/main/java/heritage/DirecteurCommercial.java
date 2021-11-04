/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import java.util.ArrayList;

/**
 *
 * @author Stagiaire
 */
public class DirecteurCommercial extends Commercial {

    private ArrayList<Commercial> commerciaux;

    public DirecteurCommercial(double salaireDeBase) {
        super(salaireDeBase);       
        commerciaux = new ArrayList<Commercial>();

    }

    public ArrayList<Commercial> getCommerciaux() {
        return commerciaux;
    }

    @Override
    public double getSalaire() {
        double result=0;
        for (int i = 0; i < getCommerciaux().size(); i++) {
            result += commerciaux.get(i).getCommission();
        }
        return super.getSalaire() + .2 * result;
    }
    
    

}
