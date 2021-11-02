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
    assertTrue(tasFinal.invariantEstOk());
    assertTrue(tasInitial.invariantEstOk());
    assertTrue(brouette.invariantEstOk());

  }
  
  @Test
  public void testPeutDeplacerTasOk(){
    Recipient tasInitial = new Recipient(4, 4);
    Recipient brouette = new Recipient(1, 3);
    Recipient tasFinal = new Recipient(5,20);
    TasDeSable instance = new TasDeSable(tasInitial, brouette, tasFinal);
    assertTrue(instance.peutDeplacerTas());
  }
  @Test
  public void testPeutDeplacerTasPasOk(){
    Recipient tasInitial = new Recipient(4, 4);
    Recipient brouette = new Recipient(1, 3);
    Recipient tasFinal = new Recipient(5,7);
    TasDeSable instance = new TasDeSable(tasInitial, brouette, tasFinal);
    assertFalse(instance.peutDeplacerTas());
  }
}
