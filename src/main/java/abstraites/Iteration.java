package abstraites;

/**
 *
 * @author Stagiaire
 */
public abstract class Iteration {
    /**Initialise l'itération ( ce qu'il faut faire avant de 
     *répeter une action.
     */
    public abstract void commencer();
    
    /**Avancer d'une étape 
     * Requiert !estTermine()
     */
    
    public abstract void avancer();
    
    public abstract boolean estTermine();
    
    public void executer(){
        commencer();
        while (!estTermine()){
            avancer();
        }
        
    }


    
    
}
