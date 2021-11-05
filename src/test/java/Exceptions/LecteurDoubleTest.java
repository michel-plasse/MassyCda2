/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thoma
 */
public class LecteurDoubleTest {
    
    public LecteurDoubleTest() {
    }

    @Test
    public void testInputOk() {
        LecteurDouble lecteur = new LecteurDouble();
        lecteur.input("12.56");
        assertEquals(12.56,lecteur.getValue().doubleValue());
    }   

    @Test
    public void testInputKo() {
        LecteurDouble lecteur = new LecteurDouble();
        lecteur.input("douze");
        assertEquals(12,lecteur.getValue().doubleValue());
    }
}
