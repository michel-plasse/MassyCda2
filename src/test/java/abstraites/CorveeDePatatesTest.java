
package abstraites;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import recipient.Recipient;


public class CorveeDePatatesTest {

    public CorveeDePatatesTest() {
    }

    @Test
    public void testExecuter() {
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
    public void voirAvancement() {
        Recipient tasDePatates = new Recipient(10, 10);
        Recipient panier = new Recipient(1, 3);
        Recipient marmite = new Recipient(0, 5);
        CorveeDePatates instance = new CorveeDePatates(tasDePatates, panier, marmite);

        instance.commencer();

        System.out.println(instance.toString());
        System.out.println("Itérer");
        while (!instance.estTermine()) {
            instance.avancer();
            System.out.println(instance.toString());
        }
    }

}
