
package abstrait;

import abstraites.CorveePatates;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import recipient.Recipient;
/**
 *
 * @author Stagiaire
 */
public class CorveePatatesTest {
    

  @Test
  public void testExecuter() {
      //given
    Recipient tasDePatates = new Recipient(10, 10);
    Recipient panier = new Recipient(1, 3);
    Recipient marmite = new Recipient(0, 5);
    CorveePatates instance = new CorveePatates(tasDePatates, panier, marmite);
    //when
    instance.executer();
    //then
    assertTrue(marmite.estPlein());
    assertEquals(4, tasDePatates.getQuantite());
    assertEquals(2, panier.getQuantite());
  }
  
  @Test
  public void voirAvancement(){
    //given
    Recipient tasDePatates = new Recipient(10, 10);
    Recipient panier = new Recipient(1, 3);
    Recipient marmite = new Recipient(0, 5);
    CorveePatates instance = new CorveePatates(tasDePatates, panier, marmite);
    //
    System.out.println("commencer");
    instance.commencer();
      System.out.println("iterer");
      while ( !instance.estTermine()){
          instance.avancer();
          System.out.println(instance.toString());
      }
      
  }
}

