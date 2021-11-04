
package recipient;

/**
 *
 * @author Florian
 */
public class Cantine {
    
    private Recipient bac,cuisine;
    private int assiettes;
    /**
     * instancie une cantine avec les récipients spécifiés
     * @param assiettes
     * @param bac
     * @param cuisine 
     */
    public Cantine(int assiettes, Recipient bac, Recipient cuisine) {
        this.bac=bac;
        this.cuisine=cuisine;
        this.assiettes=assiettes;
    }

    /**
     * remplis les assiettes jusqu'a ce que tout le monde soit servi
     */
    public void servirTous() {
        assert cuisine.getQuantite()+bac.getQuantite()>=assiettes : "quantite de plats insuffisante en cuisine";
        Recipient usagers = new Recipient(0,assiettes);
        for(int i = assiettes;i>0;i--){
            if(bac.estVide()){
                cuisine.remplir(bac);
            }
            bac.mettreUnDans(usagers);
        }
    }
    /**
     * remplis jusqu'à ce qu'on ai épuisé la cuisine ou servi tout le monde
     */
    public void servirSiPossible(){
        Recipient usagers = new Recipient(0,assiettes);
        while(!usagers.estPlein()&&!(cuisine.estVide()&&bac.estVide())){
            if(bac.estVide()){
                cuisine.remplir(bac);
            }
            bac.mettreUnDans(usagers);
        }
    }
    
}
