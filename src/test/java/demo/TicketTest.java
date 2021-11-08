/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thoma
 */
public class TicketTest {
    
    public TicketTest() {
    }

    @Test
    public void testGlobal(){
        Ticket t1 = new Ticket();
        assertEquals(11,t1.getNumero());
        assertEquals(t1.getNumero(),Ticket.getNoCourant());
        Ticket t2 = new Ticket();
        assertEquals(12,t2.getNumero());
        assertEquals(t2.getNumero(),Ticket.getNoCourant());
    }
    
}
