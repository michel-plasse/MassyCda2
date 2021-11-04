/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritage;

import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public class DirecteurCommercial extends Commercial{
        
    private ArrayList<Commercial> commerciaux;

    public DirecteurCommercial(double salaireDeBase) {
        super(salaireDeBase);
        this.commerciaux = new ArrayList<>();
    }

    public ArrayList<Commercial> getCommerciaux() {
        return commerciaux;
    }
    
    @Override
    public double getSalaire(){
        double commercialsPourcentage = 0;
        for(int i =0; i< commerciaux.size(); i++)
        {
           commercialsPourcentage += commerciaux.get(i).getCommission()*20/100;
        }
        return super.getSalaire()+commercialsPourcentage;
    }
}