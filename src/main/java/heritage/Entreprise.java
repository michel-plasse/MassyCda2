
package heritage;

import java.util.ArrayList;

/**
 *
 * @author Florian
 */
public class Entreprise {
    private ArrayList<Salarie> salaries;
    
    /**
     * Initialise une entreprise sans salaries
     */
    public Entreprise() {
        this.salaries = new ArrayList<Salarie>();
    }

    public ArrayList<Salarie> getSalaries() {
        return salaries;
    }
    
    public double getMasseSalariale(){
        double result = 0;
        for(int i=0;i<salaries.size();i++){
            result+=salaries.get(i).getSalaire();
        }
        return result;
    }
}
