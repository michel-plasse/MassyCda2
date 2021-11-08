/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package classesAbstraites;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import recipient.v3.Recipient;

/**
 *
 * @author thoma
 */
public class TasDeSableTest {

    public TasDeSableTest() {
    }

    @Test
    public void testExecution() {

        // Given (initialisation): 
        Recipient tasInitial = new Recipient(7, 12);
        Recipient brouette = new Recipient(1, 2);
        Recipient tasFinal = new Recipient(1, 10);

        TasDeSable instance;
        instance = new TasDeSable(tasInitial, brouette, tasFinal);
        assertTrue(instance.peutDeplacerTas());

        // Where:
        System.out.println("Commencer:");
        instance.executer();
        // Then:
        assertTrue(tasInitial.estVide());
        assertTrue(brouette.estVide());
        assertEquals(9, tasFinal.getQuantite());
    }

    @Test
    public void testPasAPas() {
        // Given (initialisation): 
        Recipient tasInitial = new Recipient(5, 5);
        Recipient brouette = new Recipient(1, 2);
        Recipient tasFinal = new Recipient(3, 10);

        TasDeSable instance;
        instance = new TasDeSable(tasInitial, brouette, tasFinal);
        assertTrue(instance.peutDeplacerTas());

        // Where:
        System.out.println("Commencer:");
        instance.commencer();

        System.out.println("Iterer:");
        while (!instance.estTermine()) {
            instance.avancer();
            System.out.println(instance.toString());
        }
        // Then:
        assertTrue(tasInitial.estVide());
        assertTrue(brouette.estVide());
        assertEquals(9, tasFinal.getQuantite());
    }

}
