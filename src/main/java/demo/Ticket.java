/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author thoma
 */
public class Ticket {
    //** Variable partagée par toute les instance+/
    private static int noCourant;
    // Initialise les attributs static:
    static{
        noCourant = 10;
    }
    
    private final int numero;
    
    public Ticket(){
        noCourant++;
        numero = noCourant;
    }

    public static int getNoCourant() {
        return noCourant;
    }

    public int getNumero() {
        return numero;
    }
    
}
