/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesAbstraites;

/**
 *
 * @author thoma
 */
public abstract class Iteration {
    
    /** ce qu'il faut faire avant de répéter une action
     */
    public abstract void commencer();
    
    /** Avancer d'une étape 
     * <br> Requiert !estTermine() 
     */    
    public abstract void avancer();
    
    /** Renvoie true si toutes les étapes sont terminées
    * @return 
    */
    public abstract boolean estTermine();
    
    /**
     * Exécute le progralle
     */
    public void executer(){
        commencer();
        while(!estTermine()){
            avancer();
        }
    }
    
}
