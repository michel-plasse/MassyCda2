package abstraites;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import recipient.Recipient;

/**
 *
 * @author michel
 */
public class CorveePatatesTest {

  @Test
  public void testExecuter() {
    // Given
    Recipient tasDePatates = new Recipient(10, 10);
    Recipient panier = new Recipient(1, 3);
    Recipient marmite = new Recipient(0, 5);
    CorveePatates instance = new CorveePatates(tasDePatates, panier, marmite);
    // When
    instance.executer();
    // Then
    assertTrue(marmite.estPlein());
    assertEquals(4, tasDePatates.getQuantite());
    assertEquals(2, panier.getQuantite());
  }

  @Test
  public void voirAvancement() {
    // Given
    Recipient tasDePatates = new Recipient(10, 10);
    Recipient panier = new Recipient(1, 3);
    Recipient marmite = new Recipient(0, 5);
    CorveePatates instance = new CorveePatates(tasDePatates, panier, marmite);
    //
    System.out.println("commencer");
    instance.commencer();
    System.out.println(instance.toString());
    System.out.println("iterer");
    while (!instance.estTermine()) {
      instance.avancer();
      System.out.println(instance.toString());
    }
  }
}
