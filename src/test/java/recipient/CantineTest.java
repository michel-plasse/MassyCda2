
package recipient;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Florian
 */
public class CantineTest {
    
    public CantineTest() {
    }

    @Test
    public void testServirTous() {
        Recipient cuisine = new Recipient(20,25);
        Recipient bac = new Recipient(0,5);
        Cantine instance = new Cantine(13,bac,cuisine);
        instance.servirTous();
        assertEquals(5,cuisine.getQuantite());
        assertEquals(2,bac.getQuantite());
    }
    
}
