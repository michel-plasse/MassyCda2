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
 * @author Florian
 */
public class CommercialTest {

    public CommercialTest() {
    }

    @Test
    public void testGetSalaire() {
        System.out.println("getSalaire");
        Commercial instance = new Commercial(2000);
        instance.setCommission(150);
        assertEquals(2150,instance.getSalaire(),0.001);
    }

}



