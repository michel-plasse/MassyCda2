package recipient;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TasDeSableTest {

  @Test
  public void testDeplacerTas() {
    Recipient tasInitial = new Recipient(4, 4);
    Recipient brouette = new Recipient(0, 3);
    Recipient tasFinal = new Recipient(5, 10);

    TasDeSable instance = new TasDeSable(tasInitial, brouette, tasFinal);
    instance.deplacerTas();
    assertTrue(tasInitial.estVide());
    assertTrue(brouette.estVide());
    assertEquals(9, tasFinal.getQuantite());
  }

  @Test
  public void testPeutDeplacerTasOk() {
    System.out.println("peutDeplacerTas");
    Recipient tasInitial = new Recipient(5, 5);
    Recipient brouette = new Recipient(1, 3);
    Recipient tasFinal = new Recipient(0, 20);
    TasDeSable instance = new TasDeSable(tasInitial, brouette, tasFinal);
    assertTrue(instance.peutDeplacerTas());
  }

  @Test
  public void testPeutDeplacerTasKo() {
    System.out.println("peutDeplacerTas");
    Recipient tasInitial = new Recipient(5, 5);
    Recipient brouette = new Recipient(0, 3);
    Recipient tasFinal = new Recipient(2, 5);
    TasDeSable instance = new TasDeSable(tasInitial, brouette, tasFinal);
    assertFalse(instance.peutDeplacerTas());
  }

}
