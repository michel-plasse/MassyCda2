/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package heritage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thoma
 */
public class ComptoirTest {
    
    public ComptoirTest() {
    }

    @Test
    public void testRemplirTous() {
        //Given: 
        // Initialisation du comptoir;
        Comptoir instance = new Comptoir(4,7);
        instance.getVerres().add(new Verre(0,1,true));
        instance.getVerres().add(new Verre(0,1,true));
        instance.getVerres().add(new Verre(0,1,false));
        //When
        instance.remplirTous();
        System.out.println(instance.getNombreVerresRaisin());
        System.out.println(instance.getVerres().size());
        //Then:
        assertTrue(instance.tousLesVerresRemplis());
        assertEquals(2,instance.getTonneauRaisin().getQuantite());
        assertEquals(6,instance.getTonneauOrange().getQuantite());
    }
    
}
