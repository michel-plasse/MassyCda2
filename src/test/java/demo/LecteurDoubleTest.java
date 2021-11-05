package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LecteurDoubleTest {
    
    public LecteurDoubleTest() {
    }

    @Test
    public void testOK() {
        System.out.println("Test OK");
        // given
        LecteurDouble instance = new LecteurDouble();
        // when        
        instance.setInput("25.4");
        // Then
        assertEquals(25.4, instance.getValue());
    }
    
    @Test
    public void testKO() {
        System.out.println("Test KO");
        // given
        LecteurDouble instance = new LecteurDouble();
        // when        
        instance.setInput("How are you ?");
        // Then
        assertEquals(null, instance.getValue());
    }
}
