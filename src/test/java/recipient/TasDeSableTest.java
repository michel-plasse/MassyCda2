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
public void testPeutDeplacerTas(){
    Recipient tasInitial = new Recipient(4, 4);
    Recipient brouette = new Recipient(0, 3);
    Recipient tasFinal = new Recipient(5, 10);
    TasDeSable instance = new TasDeSable(tasInitial, brouette, tasFinal);
    assertTrue(instance.peutDeplacerTas());
    tasInitial = new Recipient(9, 14);
    brouette = new Recipient(2, 3);
    tasFinal = new Recipient(5, 10);
    instance = new TasDeSable(tasInitial, brouette, tasFinal);
    assertTrue(!instance.peutDeplacerTas());
}
}
