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

        // Polymorphisme : une variable peut prendre plusieurs formes (forme = type)
        Salarie s = instance;
        // Typage statique = les opérations permises sur une variable
        // sont celles de son type déclaré et lui seul (ici Salarie)
        double d = s.getSalaire(); // ok
        // d = s.getCommission(); PAS OK, car getCommission n'est pas dans Salarie
        // Liaison dynamique = la version de la méthode à exécuter est celle du corps
        // pas de la casquette (le type instancié et non le type déclaré)
        assertEquals(3100, d, .01);
    }
}
