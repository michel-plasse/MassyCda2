
package abstraite;

import recipient.Recipient;

/**
 *
 * @author Florian
 */
public class Verre extends Recipient implements Comparable<Verre>{
    private boolean estARaisin;

    public Verre(boolean estARaisin, int quantite, int capacite) {
        super(quantite, capacite);
        this.estARaisin = estARaisin;
    }

    @Override
    public int compareTo(Verre autre) {
        int result = 0;
        if(getCapacite()<autre.getCapacite()){
            result = -1;
        }else if (getCapacite()>autre.getCapacite()){
            result = 1;
        }
        return result;
    }
    
}
