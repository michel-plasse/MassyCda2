/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraites;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import recipient.Recipient;

/**
 *
 * @author Stagiaire
 */
public class VerreTest {
    
    public VerreTest() {
    }

    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Verre autre = new Verre(0,1, true);
        Verre instance = new Verre(0,2, false);
        assertEquals(1, instance.compareTo(autre));
    }
    
}
