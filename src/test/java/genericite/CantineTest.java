package genericite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import recipient.v3.Recipient;

/**
 *
 * @author thoma
 */
public class CantineTest {
    
    
    @Test
    public void servirTousTest(){
        //Given:
        Recipient cuisine = new Recipient(20,20);
        Recipient bac = new Recipient(2,6);
        Cantine instance = new Cantine(6,1,bac,cuisine);
        assert instance.peutServirTous();
        
        //when
        instance.servirTous();
        
        //Then:
        assertEquals(14,cuisine.getQuantite());
        assertEquals(2,bac.getQuantite());
    }
    
    
}
