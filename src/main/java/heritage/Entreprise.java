package heritage;

import java.util.ArrayList;


public class Entreprise {
    ArrayList<Salarie> salaries;
    
    /**Initialise une entreprise sans salariés ( la liste sera vide)*/
    
    public Entreprise(){
        salaries = new ArrayList<Salarie>();
        
    }

    public ArrayList<Salarie> getSalaries() {
        return salaries;
    }
    
    public double getMasseSalarie(){
        double result = 0;
        for (int i = 0 ; i < salaries.size() ; i++){
            result += salaries.get(i).getSalaire();
        }
        return result;
    }
    
    
}
