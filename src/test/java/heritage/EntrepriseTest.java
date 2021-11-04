
package heritage;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Florian
 */
public class EntrepriseTest {
    
    public EntrepriseTest() {
    }

    @Test
    public void testGetMasseSalariale() {
        Entreprise instance = new Entreprise();
        Salarie salarie = new Salarie(2000);
        Commercial commercial = new Commercial(1800);
        DirecteurCommercial directeur = new DirecteurCommercial(2000);
        directeur.getCommerciaux().add(commercial);
        commercial.setCommission(500);
        directeur.setCommission(1000);
        instance.getSalaries().add(salarie);
        instance.getSalaries().add(commercial);
        instance.getSalaries().add(directeur);
        
        assertEquals(7400,instance.getMasseSalariale());
        
        
    }
    
}
