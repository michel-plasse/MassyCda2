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
public class CorveeDePatatesTest {
    
    public CorveeDePatatesTest() {
    }

    @Test
    public void testRemplirMarmite() {
    Recipient tasDePatates = new Recipient(10, 10);
    Recipient panier = new Recipient(1, 3);
    Recipient marmite = new Recipient(0, 5);
    CorveeDePatates instance = new CorveeDePatates(tasDePatates, panier, marmite);

    
    instance.executer();

    assertTrue(marmite.estPlein());
    assertEquals(4, tasDePatates.getQuantite());
    assertEquals(2, panier.getQuantite());
    }
    
    @Test 
    public void voirAvancement(){
           
    Recipient tasDePatates = new Recipient(10, 10);
    Recipient panier = new Recipient(1, 3);
    Recipient marmite = new Recipient(0, 5);
    CorveeDePatates instance = new CorveeDePatates(tasDePatates, panier, marmite);

    System.out.println("Commencer:");
    instance.commencer();
    
    System.out.println("Iterer:");
    while(!instance.estTermine()){
        instance.avancer();
        System.out.println(instance.toString());
    }

    assertTrue(marmite.estPlein());
    assertEquals(4, tasDePatates.getQuantite());
    assertEquals(2, panier.getQuantite());
        
    }
    
}
