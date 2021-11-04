
package recipient;

/**
 *
 * @author Florian
 */
public class Cantine {
    
    Recipient bac,cuisine;
    int assiettes;
    Cantine(int assiettes, Recipient bac, Recipient cuisine) {
        this.bac=bac;
        this.cuisine=cuisine;
        this.assiettes=assiettes;
    }

    void servirTous() {
        assert cuisine.getQuantite()+bac.getQuantite()>=assiettes : "quantite de plats insuffisante en cuisine";
        Recipient usagers = new Recipient(0,assiettes);
        for(int i = assiettes;i>0;i--){
            if(bac.estVide()){
                cuisine.remplir(bac);
            }
            bac.mettreUnDans(usagers);
        }
    }
    
}
