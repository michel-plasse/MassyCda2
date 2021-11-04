/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package heritage;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thoma
 */
public class DirecteurCommercialTest {
    
    @Test
    public void DirecteurCommercialTest() {
        //Given:
        DirecteurCommercial instance = new DirecteurCommercial(2000);
        instance.setCommission(1000); 
        Commercial commercial = new Commercial(1500);
        commercial.setCommission(1000);
        instance.getCommerciaux().add(commercial);
        commercial = new Commercial(1600);
        commercial.setCommission(2000);
        
        //When:
        instance.getCommerciaux().add(commercial);
        
        //Then:
        assertEquals(3600,instance.getSalaire());
        
        System.out.println("DirecteurCommercial salary:");
        System.out.println(instance.getSalaire());
        
        
    }

    
}
