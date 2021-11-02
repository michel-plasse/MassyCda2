
package demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class LecteurDoubleTest {
    
    public LecteurDoubleTest() {
    }

    @Test
    public void testOk() {
        System.out.println("ok");
        //Given
        LecteurDouble instance = new LecteurDouble();
        //When
        instance.setInput("25.4");
        //Then
        assertEquals(25.4, instance.getValue(), 0.01);
       
    }
    
     @Test
    public void testKO() {
        System.out.println("ok");
        //Given
        LecteurDouble instance = new LecteurDouble();
        //When
        instance.setInput("un");
        //Then
        assertEquals(null, instance.getValue());
       
    }
    
}
