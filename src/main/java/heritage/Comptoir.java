/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritage;

import java.util.ArrayList;
import recipient.v3.Recipient;

/**
 *
 * @author thoma
 */
public class Comptoir {
    private ArrayList<Verre> verres;
    private Recipient tonneauRaisin,tonneauOrange;
     /**
     * Comptoir a une liste vide de verre un tonneau d'orange rempli de quantiteOrange
     * et un tonneau raisin rempli de quantite raisin.
     * @param quantiteRaisin
     * @param quantiteOrange
     * @author thoma
     */
    public Comptoir(int quantiteRaisin, int quantiteOrange){
        this.tonneauOrange = new Recipient(quantiteOrange,quantiteOrange);
        this.tonneauRaisin = new Recipient(quantiteRaisin,quantiteRaisin);
        verres = new ArrayList<>();
        
    }
    
    public void remplirTous(){
        assert peutRemplirTous(): "ne peut pas remplir tout les verres";
        for (int i=0; i<verres.size(); i++)
        {
            if (verres.get(i).getEstARaisin())
            {
                tonneauRaisin.remplir(verres.get(i));
            }
            else tonneauOrange.remplir(verres.get(i));
        }
    }
    
    /**
     * Assure que tout les verres de la liste peuvent etre remplis 
     * avec la contenance des tonneaux d orange et/ou raisin;
     * @return 
     */
    public boolean peutRemplirTous(){
        return (tonneauOrange.getQuantite()>=getNombreVerresOrange()
        && tonneauRaisin.getQuantite()>= getNombreVerresRaisin());
    }
    
    public boolean tousLesVerresRemplis()
    {
        for (int i=0;i<verres.size(); i++)
        {
            if(!verres.get(i).estPlein())
            {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Verre> getVerres() {
        return verres;
    }

    public Recipient getTonneauRaisin() {
        return tonneauRaisin;
    }

    public Recipient getTonneauOrange() {
        return tonneauOrange;
    }
    
    public int getNombreVerresRaisin()
    {
        int result = 0;
        for (int i=0;i<verres.size(); i++)
        {
            if(verres.get(i).getEstARaisin()){
                result ++;
            }
        }
        return result;
    }
    public int getNombreVerresOrange()
    {
        int result = 0;
        for (int i=0;i<verres.size(); i++)
        {
            if(!verres.get(i).getEstARaisin()){
                result ++;
            }
        }
        return result;
    }
}
