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

    @org.junit.jupiter.api.Test
    public void testGetTasInitial() {
        System.out.println("getTasInitial");
        TasDeSable instance = null;
        Recipient expResult = null;
        Recipient result = instance.getTasInitial();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testGetBrouette() {
        System.out.println("getBrouette");
        TasDeSable instance = null;
        Recipient expResult = null;
        Recipient result = instance.getBrouette();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testGetTasFinal() {
        System.out.println("getTasFinal");
        TasDeSable instance = null;
        Recipient expResult = null;
        Recipient result = instance.getTasFinal();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testPeutDeplacerTas() {
        System.out.println("peutDeplacerTas");
        TasDeSable instance = null;
        boolean expResult = false;
        boolean result = instance.peutDeplacerTas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
