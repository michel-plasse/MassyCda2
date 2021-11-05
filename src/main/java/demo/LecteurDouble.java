package demo;

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
