package recipient;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CorveeDePatatesTest {

  @Test
  public void testRemplirMarmite() {
    Recipient tasDePatates = new Recipient(10, 10);
    Recipient panier = new Recipient(1, 3);
    Recipient marmite = new Recipient(0, 5);
    CorveeDePatates instance = new CorveeDePatates(tasDePatates, panier, marmite);

    instance.remplirMarmite();

    assertTrue(marmite.estPlein());
    assertEquals(4, tasDePatates.getQuantite());
    assertEquals(2, panier.getQuantite());
  }
}
