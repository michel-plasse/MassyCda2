/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Stagiaire
 */
public class LecteurDouble {

    private Double value;

    /**
     *
     * @param string
     */
    public void setInput(String string) {
        assert string != null;

        try {
            value = Double.parseDouble(string);

        } catch (NumberFormatException exc) {
            value = null;
        }
    }

    public Double getValue() {
        return value;
    }

}
