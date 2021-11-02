package recipient;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TasDeSableTest {

    public TasDeSableTest() {
    }

    @Test
    public void testDeplacerTas() {
        // Given (initialisation): 
        Recipient tasInitial = new Recipient(5, 5);
        Recipient brouette = new Recipient(1, 2);
        Recipient tasFinal = new Recipient(3, 10);

        TasDeSable instance = new TasDeSable(tasInitial, brouette, tasFinal);
        assert instance.peutDeplacerTas() : "Le tas ne peut pas être déplacé";

        // Where:
        instance.deplacerTas();
        // Then:
        assertTrue(tasInitial.estVide());
        assertTrue(brouette.estVide());
        assertEquals(9, tasFinal.getQuantite());
    }

}
