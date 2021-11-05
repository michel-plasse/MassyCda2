
package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Florian
 */
public class LecteurDoubleTest {
    
    public LecteurDoubleTest() {
    }

    @Test
    public void testGetValueOk() {
        LecteurDouble instance = new LecteurDouble();
        instance.setInput("-9");
        assertEquals(-9,instance.getValue(),0.01);
    }
    
    @Test
    public void testGetValuePasOk(){
        LecteurDouble instance = new LecteurDouble();
        instance.setInput("quatre");    
        assertEquals(null,instance.getValue());
    }
}
