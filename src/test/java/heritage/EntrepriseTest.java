package heritage;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thoma
 */
public class EntrepriseTest {
    
    public EntrepriseTest() {
    }

    @Test
    public void testGetMasseSalariale() {
        System.out.println("getMasseSalariale");
        Entreprise instance = new Entreprise();
        DirecteurCommercial d = new DirecteurCommercial(2000);
        d.setCommission(1200);
        instance.getSalaries().add(d);
        Commercial c = new Commercial(2000);
        c.setCommission(600);
        d.getCommerciaux().add(c);
        instance.getSalaries().add(c);
        instance.getSalaries().add(new Salarie(1000));
        
        assertEquals(6920.00,instance.getMasseSalariale(),0.001);
    }
    
}
