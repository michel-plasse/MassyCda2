/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericite;
import java.util.ArrayList;
import recipient.v3.Recipient;


/**
 *
 * @author thoma
 */
public class Cantine {
    private Recipient cuisine;
    private Recipient bac;
    private ArrayList<Recipient> assiettes;
    
    public Cantine(int nbAssiettes, int capaciteAssiettes,Recipient bac, Recipient cuisine){
        this.bac = bac;
        this.cuisine = cuisine;
        this.assiettes = new ArrayList<>();
        
        for (int i=0; i< nbAssiettes;i++)
        {
            assiettes.add(new Recipient(0,capaciteAssiettes));
        }
    }
    
    public boolean peutServirTous()
    {
        return (bac.getQuantite() + cuisine.getQuantite()
              >= this.assiettes.size());
    }
    
  /** Sert une portion dans toutes les assiettes
   * <br>Require: peutServirTous();
   */
    public void servirTous()
    {
        for (int i=0 ; i<assiettes.size(); i++){
            bac.remplir(assiettes.get((i)));
            if(bac.estVide()) cuisine.remplir(bac);
        }
    }
}
