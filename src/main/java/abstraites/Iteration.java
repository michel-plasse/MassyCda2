
package abstraites;


public abstract class Iteration {

    /**
     * Ce qu'il faut faire avant de répéter l'action.
     */
    public abstract void commencer();
    
    /**
     * Avancer d'une étape
     * Requiert !estTermine()
     */
    public abstract void avancer();
    
    public abstract boolean estTermine();
    
    public void executer() {
        commencer();
        while(!estTermine()) {
            avancer();
        }
    }
    
}
