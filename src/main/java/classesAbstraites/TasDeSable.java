package classesAbstraites;
import recipient.v3.Recipient;

/**
 *
 * @author thoma
 */
public class TasDeSable extends Iteration {

    private Recipient tasInitial, brouette, tasFinal;

    public TasDeSable(Recipient tasInitial, Recipient brouette, Recipient tasFinal) {
        this.tasInitial = tasInitial;
        this.brouette = brouette;
        this.tasFinal = tasFinal;
    }

    public Recipient getTasInitial() {
        return tasInitial;
    }

    public Recipient getBrouette() {
        return brouette;
    }

    public Recipient getTasFinal() {
        return tasFinal;
    }

    public boolean peutDeplacerTas() {
        return (tasInitial.getQuantite() + brouette.getQuantite() <= tasFinal.getEspaceLibre());
    }

    /**
     * Tas de Sable à déplacer.
     * <br> Require: peutDeplacerTas();
     *
     */
    void deplacerTas() {

    }

    @Override
    public void commencer() {
        assert peutDeplacerTas() : "Le tas ne peut être déplacé";
    }

    @Override
    public void avancer() {
    if (!brouette.estPlein() && !tasInitial.estVide() && brouette.estVide()) {
        if (tasInitial.getQuantite() >= brouette.getEspaceLibre()) {
            tasInitial.remplir(brouette);
        } else {
            tasInitial.viderDans(brouette);
        }
    }
    brouette.viderDans(tasFinal);
    }

    @Override
    public boolean estTermine() {
        return tasInitial.estVide() && brouette.estVide();
    }

    @Override
    public String toString() {
        return "TasDeSable{" + "tasInitial=" + tasInitial.getQuantite() + ", brouette=" + brouette.getQuantite()  + ", tasFinal=" + tasFinal.getQuantite()  + '}';
    }
    
    

}
