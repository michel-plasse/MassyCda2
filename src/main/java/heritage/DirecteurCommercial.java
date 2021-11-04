
package heritage;

import java.util.ArrayList;

/**
 *
 * @author Florian
 */
public class DirecteurCommercial extends Commercial {
    
    private ArrayList<Commercial> commerciaux;

    public DirecteurCommercial(double salaireDeBase) {
        super(salaireDeBase);
        this.commerciaux = new ArrayList<Commercial>();
    }

    public ArrayList<Commercial> getCommerciaux() {
        return commerciaux;
    }

    @Override
    public double getSalaire() {
        double autresCommissions=0;
        for (int i=0;i<commerciaux.size();i++){
            autresCommissions += commerciaux.get(i).getCommission();
        }
        return super.getSalaire()+0.2*autresCommissions; 
    }
    
    
    
}
