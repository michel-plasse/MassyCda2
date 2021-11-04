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
public class CommercialTest {
    @Test
    public void testGetSalaire() {
        Commercial instance = new Commercial(2000);
        instance.setCommission(150);
    }
    public CommercialTest() {
    }

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
        fail("The test case is a prototype.");
    }
    
}
