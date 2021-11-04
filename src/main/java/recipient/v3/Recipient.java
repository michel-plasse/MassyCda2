package recipient.v3;

/**
 *
 * @author thoma
 */
public class Recipient {
    
    private int espaceLibre, capacite;
    
    /**
    * Initialise le récipient avec la quantite et la capacité indiquées.
    *<br> Requiert quantité positive ou nulle,
    *<br> Requiert capacité strictement positive.
    * @param quantite
    * @param capacite
    */
    public Recipient(int quantite, int capacite) {
        this.capacite = capacite;
        this.espaceLibre = capacite - quantite;
    }    

    /**
     * Transfère un élément de l'objet courant dans l'autre.
     * <br> Requiert !estVide and !autre.estPlein();
     * @param autre 
     */
    public void mettreUnDans(Recipient autre) {
        
        this.espaceLibre ++;
        autre.espaceLibre --;
    }
    
     /**
     * L'objet courant remplit un autre recipient avec ses elements
     * <br> Requiert !estVide and !autre.estPlein();
     * <br> Requiert getQuantite + autre.getQuantite() >= autre.getEspaceLibre()
     * @param autre 
     */
    public void remplir(Recipient autre) {
        assert getQuantite() + autre.getQuantite() >= autre.getEspaceLibre()
                : " pas assez d'elment pour remplir autre recipient";
        this.espaceLibre = this.espaceLibre + autre.getEspaceLibre();
        autre.espaceLibre = 0;
    }
    
    public void viderDans(Recipient autre) {
        autre.espaceLibre -= this.getQuantite();
        this.espaceLibre = this.capacite;
    }

    public int getQuantite() {
        return this.capacite - this.espaceLibre;
        
    }

    public int getCapacite() {
        return this.capacite;
    
    }
    
    public int getEspaceLibre() {
        return this.espaceLibre;
    }
    
    public boolean estVide() {
        return (this.espaceLibre == this.capacite);
    }
    
    public boolean estPlein() {
        return (this.espaceLibre == 0);
        
    }
        
    public boolean invariantEstOk() {
        assert getQuantite() >= 0;
        assert getEspaceLibre() >= 0;
        assert getCapacite() > 0;
        assert ( getCapacite() == getQuantite() + getEspaceLibre());
        assert (estVide() == (getQuantite() == 0 ));
        assert (estPlein() == (getEspaceLibre() == 0 ));
        return true;
    }
}