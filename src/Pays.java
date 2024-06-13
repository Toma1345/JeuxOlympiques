/**
 * La classe Pays représente un pays.
 * Elle possède un attribut qui est le nom du pays.
 */
public class Pays {
    
    private final String nomPays;

    /**
     * Construit une instance de Pays avec le nom spécifié.
     * @param nomP le nom du pays
     */
    public Pays(String nomP) {
        this.nomPays = nomP;
    }

    /**
     * Retourne le nom du pays.
     * @return le nom.
     */
    public String getNomPays() {
        return this.nomPays;
    }
}
