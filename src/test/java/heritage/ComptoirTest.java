/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Stagiaire
 */
public class ComptoirTest {

    @Test
    public void testRemplirTous() {
        Comptoir instance = new Comptoir(5, 7);

        instance.getVerres().add(new Verre(0, 1, true));
        instance.getVerres().add(new Verre(0, 1, false));
        instance.getVerres().add(new Verre(0, 1, true));

        instance.remplirTous();

        assertTrue(instance.getVerres().get(0).estPlein());
        assertTrue(instance.getVerres().get(1).estPlein());
        assertTrue(instance.getVerres().get(2).estPlein());
        
        assertEquals(4, instance.getTonneauOrange().getQuantite());
        assertEquals(5, instance.getTonneauRaisin().getQuantite());

    }

}
