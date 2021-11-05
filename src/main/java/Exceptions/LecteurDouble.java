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

    public String inputString;

    public LecteurDouble() {

    }

    public void input(String s) {
        this.inputString = s;
    }

    public Double getValue() {
        double result;
        try {
            result = Double.parseDouble(this.inputString);
        } catch (Exception e) {
            System.out.println("Error string is not parsable");
            return null;
        }
        return result;
    };
    
    
    public String getInput() {
        return this.inputString;
    }

}
