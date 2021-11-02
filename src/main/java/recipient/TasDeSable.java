package recipient;

/**
 * Exercice du tas de sable à déplacer.
 */
public class TasDeSable {

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
        assert peutDeplacerTas(): "Le tas ne peut être déplacé";
        while (!tasInitial.estVide()) {
            while (!brouette.estPlein() && !tasInitial.estVide() && brouette.estVide()) {
                if (tasInitial.getQuantite() >= brouette.getEspaceLibre()) {
                    tasInitial.remplir(brouette);
                } else {
                    tasInitial.viderDans(brouette);
                }
            }
            brouette.viderDans(tasFinal);
        }
    }
}
