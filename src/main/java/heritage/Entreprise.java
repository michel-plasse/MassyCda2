package heritage;

import java.util.ArrayList;

public class Entreprise {

    ArrayList<Salarie> salaries;

    /**
     * Initialise une entreprise sans salariés (la liste sera vide)
     */
    public Entreprise() {
    }

    public ArrayList<Salarie> getSalaries() {
        return salaries;
    }

    public double getMasseSalariale() {
        double result = 0;
        for (int i = 0; i < salaries.size(); i++) {
            result += salaries.get(i).getSalaire();
        }
    }
}
