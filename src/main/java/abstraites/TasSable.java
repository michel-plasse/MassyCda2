package abstraites;

import recipient.Recipient;

/**
 *
 * @author michel
 */
public class TasSable extends Iteration {
  private Recipient tasInitial, brouette, tasFinal;

  public TasSable(Recipient tasInitial, Recipient brouette, Recipient tasFinal) {
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

  @Override
  public void commencer() {
  }

  @Override
  public void avancer() {
    if (brouette.estPlein() || tasInitial.estVide()) {
      brouette.viderDans(tasFinal);
    } else {
      tasInitial.mettreUnDans(brouette);
    }
  }

  @Override
  public boolean estTermine() {
    return tasInitial.estVide() && brouette.estVide();
  }

  @Override
  public String toString() {
    return tasInitial.getQuantite()
             + "/" + tasInitial.getCapacite()
            + "  " + brouette.getQuantite() 
            + "/" + brouette.getCapacite()
            + "  " + tasFinal.getQuantite() 
            + "/" + tasFinal.getCapacite();
  }
  
}
