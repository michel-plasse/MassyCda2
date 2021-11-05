
package demo;



/**
 *
 * @author Florian
 */
public class LecteurDouble {

    private Double value;
            
    /**
     * converts the received string into a double
     * Requires a correct input from user
     * @param nombre 
     */
    public void setInput(String nombre) {
        assert nombre!= null :"l'entrée ne peut être vide";
        try{
            value = Double.parseDouble(nombre);
        }catch(NumberFormatException oopsie){
            value = null;
        }
    }
    /**
     * returns the double value if setInput was succesful,null otherwise
     * @return 
     */
    public Double getValue() {
        return value;
    }
}
