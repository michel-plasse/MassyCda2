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
public class CommercialTest {
    
    public CommercialTest() {
    }



    @Test
    public void testSalaire() {
        System.out.println("getSalaire()");
        Commercial instance = new Commercial(2000);
        instance.setCommission(400);
        System.out.println("new commercial's salary:");
        System.out.println(instance.getSalaire());
        assertEquals(2400,instance.getSalaire());
    }
    
}
