
package abstraite;

import recipient.Recipient;

/**
 *
 * @author Florian
 */
public class TasDeSable extends Iteration {
    
    private Recipient tasInitial,tasFinal,brouette;

    public TasDeSable(Recipient tasInitial, Recipient tasFinal, Recipient brouette) {
        this.tasInitial = tasInitial;
        this.tasFinal = tasFinal;
        this.brouette = brouette;
    }

    public Recipient getTasInitial() {
        return tasInitial;
    }

    public Recipient getTasFinal() {
        return tasFinal;
    }

    public Recipient getBrouette() {
        return brouette;
    }

    @Override
    public void commencer() {
    }

    @Override
    public void avancer() {
        assert !estTerminé();
        if (brouette.estPlein()||tasInitial.estVide()){
            brouette.viderDans(tasFinal);
        }else{
            tasInitial.mettreUnDans(brouette);
        }
    }

    @Override
    public boolean estTerminé() {
        return (tasInitial.estVide()&&brouette.estVide());
    } 
}
