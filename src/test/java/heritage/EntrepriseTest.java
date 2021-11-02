package heritage;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stagiaire
 */
public class EntrepriseTest {
    
    public EntrepriseTest() {
    }


    @Test
    public void testGetMasseSalarie() {
        System.out.println("getMasseSalarie");
        Entreprise instance = new Entreprise();
        DirecteurCommercial directeur = new DirecteurCommercial(2000);
        directeur.setCommission(200);
        Commercial  commercial = new Commercial(1000);
        commercial.setCommission(100);
        directeur.getCommerciaux().add(commercial);
        Salarie salarie = new Salarie(600);
        instance.getSalaries().add(salarie);
        instance.getSalaries().add(directeur);
        instance.getSalaries().add(commercial);
        
        
        
        
    }
    
}
