
package abstraite;

/**
 *
 * @author Florian
 */
public abstract class Iteration {
    
    /**
     * Initialise l'itération: Ce qu'il faut faire avant de répéter l'action
     */
    public abstract void commencer();
    
    /**
     * Requiert !estTerminé
     */
    public abstract void avancer();
    
    public abstract boolean estTerminé();
    
    public void executer(){
        commencer();
        while(!estTerminé()){
            avancer();
        }
    }
}