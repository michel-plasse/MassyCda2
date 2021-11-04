/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import recipient.Recipient;

/**
 *
 * @author Stagiaire
 */
public class CantineTest {

    @Test
    public void testPeutServirTous() {
        System.out.println("Test peutServirTous");
        Recipient bac = new Recipient(0, 5);
        Recipient cuisine = new Recipient(22, 22);

        Cantine instance = new Cantine(9, bac, cuisine);

        instance.servirTous();
        assertTrue(cuisine.getQuantite() >= 9);
    }

    @Test
    public void testServirTous() {
        System.out.println("Test servirTous");
        Recipient bac=new Recipient(0,5);
        Recipient cuisine=new Recipient(22,22);
        
        Cantine instance = new Cantine(15, bac, cuisine);
    }

    @Test
    public void testServirLePlusPossible() {
    }

    @Test
    public void testResteAServir() {

    }
}
