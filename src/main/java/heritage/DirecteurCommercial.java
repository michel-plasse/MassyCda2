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
        commerciaux = new ArrayList<>();
    }

    public ArrayList<Commercial> getCommerciaux() {
        return commerciaux;
    }

    @Override
    public double getSalaire() {
        double result = 0;
        for ( int i = 0 ; i < commerciaux.size() ; i++){
            result += commerciaux.get(i).getCommission();
        }
        return super.getSalaire() + 0.2*result; 
    }
    
    
}
