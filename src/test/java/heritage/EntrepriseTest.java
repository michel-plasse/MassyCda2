/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Stagiaire
 */
public class EntrepriseTest {
    
    public EntrepriseTest() {
    }

    @Test
    public void testGetMasseSalariale() {
        System.out.println("getMasseSalariale");
        Entreprise instance = new Entreprise();
        
        Salarie salarie = new Salarie(2000);
        instance.getSalaries().add(salarie);
        
        assertEquals(2000, instance.getMasseSalariale(), 0.0);
    }
    
}
