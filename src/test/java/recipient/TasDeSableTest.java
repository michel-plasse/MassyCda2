package recipient;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TasDeSableTest {

    public TasDeSableTest() {
    }

    @Test
    public void testDeplacerTasOk() {
        // Given (initialisation): 
        Recipient tasInitial = new Recipient(5, 5);
        Recipient brouette = new Recipient(1, 2);
        Recipient tasFinal = new Recipient(3, 10);

        TasDeSable instance;
        instance = new TasDeSable(tasInitial, brouette, tasFinal);
        assertTrue(instance.peutDeplacerTas());

        // Where:
        instance.deplacerTas();
        // Then:
        assertTrue(tasInitial.estVide());
        assertTrue(brouette.estVide());
        assertEquals(9, tasFinal.getQuantite());
    }
    @Test
    public void testDeplacerTasKo() {
        // Given (initialisation): 
        Recipient tasInitial = new Recipient(5, 5);
        Recipient brouette = new Recipient(1, 2);
        Recipient tasFinal = new Recipient(9, 10);

        TasDeSable instance;
        instance = new TasDeSable(tasInitial, brouette, tasFinal);
        assertFalse(instance.peutDeplacerTas());
    }
}
