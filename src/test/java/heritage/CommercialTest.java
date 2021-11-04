/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kamal
 */
public class CommercialTest {
    
    public CommercialTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCommission method, of class Commercial.
     */
    @Test
    public void testGetCommission() {
        System.out.println("getCommission");
        Commercial instance = null;
        double expResult = 0.0;
        double result = instance.getCommission();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCommission method, of class Commercial.
     */
    @Test
    public void testSetCommission() {
        System.out.println("setCommission");
        double commission = 0.0;
        Commercial instance = null;
        instance.setCommission(commission);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
