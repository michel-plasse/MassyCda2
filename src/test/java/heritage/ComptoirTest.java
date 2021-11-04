
package heritage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Florian
 */
public class ComptoirTest {
    
    public ComptoirTest() {
    }

    @Test
    public void testRemplirTous() {
        Comptoir instance = new Comptoir(5,7);
        Verre verre = new Verre(0,1,true);
        instance.getVerres().add(verre);
        instance.getVerres().add(new Verre(0,1,false));
        instance.getVerres().add(new Verre(0,1,true));
        
        instance.RemplirTous();
        assertTrue(instance.getVerres().get(0).estPlein());
        assertTrue(instance.getVerres().get(1).estPlein());
        assertTrue(instance.getVerres().get(2).estPlein());
        assertEquals(4,instance.getTonneauOrange().getQuantite());
        assertEquals(5,instance.getTonneauRaisin().getQuantite());
    }
    
}
