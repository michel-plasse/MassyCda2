package abstraites;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import recipient.Recipient;

public class TasDeSableTest {

    @Test
    public void testExecuter() {
        Recipient tasInitial = new Recipient(4, 4);
        Recipient brouette = new Recipient(0, 3);
        Recipient tasFinal = new Recipient(5, 10);

        TasDeSable instance = new TasDeSable(tasInitial, brouette, tasFinal);
        instance.executer();
        assertTrue(tasInitial.estVide());
        assertTrue(brouette.estVide());
        assertEquals(9, tasFinal.getQuantite());
    }

    @Test
    public void voirAvancement() {
        Recipient tasInitial = new Recipient(4, 4);
        Recipient brouette = new Recipient(0, 3);
        Recipient tasFinal = new Recipient(5, 10);

        TasDeSable instance = new TasDeSable(tasInitial, brouette, tasFinal);

        instance.commencer();

        System.out.println(instance.toString());
        System.out.println("Itérer");
        while (!instance.estTermine()) {
            instance.avancer();
            System.out.println(instance.toString());
        }
    }

}
