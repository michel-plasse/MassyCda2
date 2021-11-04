
package heritage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Florian
 */
public class DirecteurCommercialTest {
    
    public DirecteurCommercialTest() {
    }

    @Test
    public void testGetSalaire() {
        DirecteurCommercial instance = new DirecteurCommercial(2000);
        instance.setCommission(500);
        Commercial commercial = new Commercial(1500);
        commercial.setCommission(1000);
        instance.getCommerciaux().add(commercial);
        commercial = new Commercial(1600);
        commercial.setCommission(2000);
        instance.getCommerciaux().add(commercial);
        assertEquals(3100,instance.getSalaire(),0.001);
        
    }
    
}
