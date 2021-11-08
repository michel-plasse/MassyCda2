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
public class VerreTest {
    
    public VerreTest() {
    }


    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Verre instance = new Verre(2,2,true);
        Verre autre = new Verre(1,1,true);
        int expResult = 1;
        int result = instance.compareTo(autre);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
