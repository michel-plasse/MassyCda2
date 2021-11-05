
package abstraite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Florian
 */
public class VerreTest {
    
    public VerreTest() {
    }

    @Test
    public void testCompareTo() {
        Verre instance = new Verre(true,0,2);
        Verre autre = new Verre(false,2,4);
        
        assertEquals(-1,instance.compareTo(autre));
        assertEquals(1,autre.compareTo(instance));
        assertEquals(0,instance.compareTo(instance));
    }
}
