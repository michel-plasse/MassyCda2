package abstraite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import recipient.Recipient;

/**
 *
 * @author Florian
 */
public class TasDeSableTest {

    @Test
    public void testExecuter() {
        Recipient tasInitial = new Recipient(4, 4);
        Recipient brouette = new Recipient(1, 3);
        Recipient tasFinal = new Recipient(5, 12);
        TasDeSable instance = new TasDeSable(tasInitial,tasFinal,brouette);
        
        instance.executer();
        assertTrue(instance.getTasInitial().estVide());
        assertTrue(instance.getBrouette().estVide());
        assertEquals(10, instance.getTasFinal().getQuantite());
    }
    
    @Test
    public void voirAvancement(){
        Recipient tasInitial = new Recipient(9, 9);
        Recipient brouette = new Recipient(1, 3);
        Recipient tasFinal = new Recipient(5,20);
        TasDeSable instance = new TasDeSable(tasInitial,tasFinal,brouette);
        
        System.out.println("commencer");
        instance.commencer();
        System.out.println("iterer");
        while(!instance.estTerminé()){
            instance.avancer();
            System.out.println(instance.toString());
        }
    }
}
