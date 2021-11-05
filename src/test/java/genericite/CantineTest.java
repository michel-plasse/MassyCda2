package genericite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import recipient.Recipient;

/**
 *
 * @author michel
 */
public class CantineTest {
  
  @Test
  public void testServirTous() {
    System.out.println("servirTous");
    Recipient bac = new Recipient(0, 5);
    Recipient cuisine = new Recipient(22, 22);
    Cantine instance = new Cantine(9, bac, cuisine);
    instance.servirTous();
    // toutes les assiettes sont pleines
    assertEquals(1, bac.getQuantite());
    assertEquals(12, cuisine.getQuantite());
  }

  @Test
  public void testServirLePlusPossible() {
    System.out.println("servirLePlusPossible");
    Recipient bac = new Recipient(0, 4);
    Recipient cuisine = new Recipient(3, 22);
    Cantine instance = new Cantine(5, bac, cuisine);
    instance.servirLePlusPossible();
    // Les 5 1eres assiettes sont pleines, les autres vides
    assertTrue(instance.getAssiettes().get(0).estPlein());
    assertTrue(instance.getAssiettes().get(1).estPlein());
    assertTrue(instance.getAssiettes().get(2).estPlein());
    assertTrue(instance.getAssiettes().get(3).estVide());
    assertTrue(instance.getAssiettes().get(4).estVide());
    assertTrue(instance.getBac().estVide());
    assertTrue(instance.getCuisine().estVide());
  }

  @Test
  public void testResteAServir() {
    System.out.println("resteAServir");
    Cantine instance = null;
    boolean expResult = false;
    boolean result = instance.resteAServir();
    assertEquals(expResult, result);
    fail("The test case is a prototype.");
  }

  @Test
  public void testPeutServirTous() {
    System.out.println("peutServirTous");
    Cantine instance = null;
    boolean expResult = false;
    boolean result = instance.peutServirTous();
    assertEquals(expResult, result);
    fail("The test case is a prototype.");
  }
  
}
