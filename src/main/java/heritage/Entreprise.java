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
public class Entreprise {
    private ArrayList<Salarie> salaries;
    
    public Entreprise(){
        salaries = new ArrayList<>();
    }
    
    public ArrayList<Salarie> getSalaries(){
        return salaries;
    }
    
    public double getMasseSalariale(){
        double result = 0;
        for(int i=0; i<salaries.size(); i++){
            result += salaries.get(i).getSalaire();
            System.out.println(salaries.get(i).getSalaire());
        }
        return result;
    }
}
