package heritage;

import recipient.Recipient;

public class Verre extends Recipient {

    public boolean estARaisin;

    /**
     * Crée un verre de quantité et de capacité données, en indiquant via un
     * boolean s'il est à raisin ou pas.
     *
     * @param quantite
     * @param capacite
     * @param estARaisin
     */
    public Verre(int quantite, int capacite, boolean estARaisin) {
        // On appelle le constructeur (initialisateur) du parent
        super(quantite, capacite);
        this.estARaisin = estARaisin;
    }

    public boolean estARaisin() {
        return estARaisin;
    }

}
