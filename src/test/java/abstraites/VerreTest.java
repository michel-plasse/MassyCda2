package abstraites;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michel
 */
public class VerreTest {
  
  public VerreTest() {
  }

  @Test
  public void testCompareTo() {
    System.out.println("compareTo");
    Verre instance = new Verre(0, 8, true);
    Verre autre = new Verre(0, 5, true);
    assertEquals(1, instance.compareTo(autre));
    assertEquals(-1, autre.compareTo(instance));
    assertEquals(0, instance.compareTo(instance));
  }
  
}
