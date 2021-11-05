package abstraites;

import recipient.Recipient;




/**
 *
 * @author Stagiaire
 */
public class TasDeSable extends Iteration{
    
    private final Recipient tasA, brouette, tasB;

    public TasDeSable(Recipient tasA, Recipient brouette, Recipient tasB) {
        this.tasA = tasA;
        this.brouette = brouette;
        this.tasB = tasB;
    }

    public Recipient getTasA() {
        return tasA;
    }

    public Recipient getBrouette() {
        return brouette;
    }

    public Recipient getTasB() {
        return tasB;
    }
    
    
    

    @Override
    public void commencer() {
    }

    @Override
    public void avancer() {
        if (brouette.estPlein() || tasA.estVide()){
            brouette.viderDans(tasB);
        }else{
            tasA.mettreUnDans(brouette);
        }
    }

    @Override
    public boolean estTermine() {
        return tasA.estVide() && brouette.estVide();
    }
    
    
}
