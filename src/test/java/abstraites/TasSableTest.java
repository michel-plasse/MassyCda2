package abstraites;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import recipient.Recipient;

/**
 *
 * @author michel
 */
public class TasSableTest {

  @Test
  public void testDeplacerTas() {
    Recipient tasInitial = new Recipient(4, 4);
    Recipient brouette = new Recipient(0, 3);
    Recipient tasFinal = new Recipient(5, 10);

    TasSable instance = new TasSable(tasInitial, brouette, tasFinal);
    instance.executer();
    assertTrue(tasInitial.estVide());
    assertTrue(brouette.estVide());
    assertEquals(9, tasFinal.getQuantite());
  }

  @Test
  public void afficherIteration() {
    Recipient tasInitial = new Recipient(4, 4);
    Recipient brouette = new Recipient(0, 3);
    Recipient tasFinal = new Recipient(5, 10);

    TasSable instance = new TasSable(tasInitial, brouette, tasFinal);
    System.out.println(instance.toString());
    while (!instance.estTermine()) {
      instance.avancer();
      System.out.println(instance.toString());
    }
  }
}
