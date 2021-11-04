
package heritage;

import recipient.Recipient;

/**
 *
 * @author Florian
 */
public class Verre extends Recipient{
    private boolean estARaisin;
    /**
     * cree un verre de quantite et capacite données,
     * en indiquant s'il est à raisin ou pas.
     * @param quantite
     * @param capacite
     * @param estARaisin 
     */
    public Verre(int quantite,int capacite,boolean estARaisin){
        //on appelle le constructeur (l'initialiseur) du parent
        super(quantite,capacite);
        this.estARaisin=estARaisin;
    }

    public boolean isEstARaisin() {
        return estARaisin;
    }
    
    
}
