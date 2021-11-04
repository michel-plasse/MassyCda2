package heritage;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DirecteurCommercialTest {
  
  @Test
  public void testGetSalaire() {
    System.out.println("getSalaire");
    DirecteurCommercial instance = new DirecteurCommercial(2000);
    instance.setCommission(500);
    Commercial commercial = new Commercial(1500);
    commercial.setCommission(1000);
    instance.getCommerciaux().add(commercial);
    commercial = new Commercial(1600);
    commercial.setCommission(2000);
    instance.getCommerciaux().add(commercial);
    assertEquals(3100, instance.getSalaire());
  }
  
}
