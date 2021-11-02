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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void avancer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estTermine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
