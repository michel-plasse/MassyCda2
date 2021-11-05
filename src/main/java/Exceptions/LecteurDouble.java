/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author thoma
 */
public class LecteurDouble {

    public Double value;

    public LecteurDouble() {

    }

    public void input(String s) {
        try {
            value = Double.parseDouble(s);
        } catch (NumberFormatException exc) {
            System.out.println("Error string is not parsable");
            value = null;
        }
    }

    public Double getValue() {
        return value;
    };
    


}
