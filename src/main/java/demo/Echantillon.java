package demo;

/**
 * Echantillon de valeurs, pourvu d'une taille, un minimum, une
 * moyenne, un maximum.
 * <br>L'implémentation stocke le résumé des données, pas leur liste.
 *
 * @author michel
 */
public class Echantillon {
    // Après l'instanciation, les nombres valent la valeur par défaut d'un nombre en Java, à savoir 0 (entiers) ou 0.0 (nombres décimaux).

    private int taille;
    private double minimum, somme, maximum;

    /**
     * Nombre d'éléments de l'échantillon
     *
     * @return
     */
    public int getTaille() {
        return taille;
    }

    /**
     * Valeur minimum.Requiert getTaille() > 0
     *
     * @return
     */
    public double getMinimum() {
        // Le require
        assert taille > 0;
        // Le code
        return minimum;
    }

    /**
     * Valeur moyenne.Requiert getTaille() > 0
     *
     * @return
     */
    public double getMoyenne() {
        assert taille > 0;
        return somme / taille;
    }

    /**
     * Valeur maximum.Requiert getTaille() > 0
     *
     * @return
     */
    public double getMaximum() {
        assert taille > 0;
        return maximum;
    }

    /**
     * Ajouter une valeur à l'échantillon.Garantit que getTaille() est
     * incrémentée de 1.
     *
     * @param valeur
     */
    public void ajouter(double valeur) {
        if (taille == 0) {
            minimum = valeur;
            maximum = valeur;
        } else {
            minimum = Math.min(minimum, valeur);
            maximum = Math.max(maximum, valeur);
        }
        taille++;
        somme += valeur;
        // les invariants doivent etre respectes
        assert estInvariantOk();
    }

    /**
     * Conditions toujours vraies
     *
     * @return
     */
    public boolean estInvariantOk() {
        assert getTaille() >= 0 : "taille négative";
        assert getTaille() == 0 || getMinimum() <= getMoyenne() : "minimum > moyenne";
        assert getTaille() == 0 || getMoyenne() <= getMaximum() : "moyenne > maximum";
        return true;
    }

}
