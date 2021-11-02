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
  
  public boolean peutDeplacerTas(){
      return (tasInitial.getQuantite()+brouette.getQuantite())<=tasFinal.getEspaceLibre();
  }
  /** Déplace le sable du tas initial vers le tas final.
   * Requiert que la brouette soit vide au départ. Hypothèse à discuter,
   * si nous la supprimons, il faut revoir le sens et les ocntrats de
   * cette opération.
   * Quel est le prérequis avec cette hypothèse, et quel serait-il sans
   * elle ?
   * Garantit que getTasInitial().estVide() et getBrouette().estVide().
   */
  void deplacerTas() {
    assert peutDeplacerTas():"l'espace libre du tas final est insuffisant pour deplacer le tas";
    while (!tasInitial.estVide()) {
      while (!brouette.estPlein() && !tasInitial.estVide()) {
        tasInitial.mettreUnDans(brouette);
      }
      brouette.viderDans(tasFinal);
    }
  }
}
