/**
 * La classe Athlete représente un pays.
 * Elle possède un attribut qui est le nom du pays.
 */
public class Athlete implements Participant {
    
    private final String nomAthlete;
    private final String prenomAthlete;
    private final char sexeAthlete;
    private int force;
    private int agilite;
    private int endurance;

    /**
     * Construit une instance de Pays avec le nom spécifié.
     * @param nomP le nom du pays
     */
    public Athlete(String nomA, String prenomA, char sexeA, int force, int agilite, int endurance) {
        this.nomAthlete = nomA;
        this.prenomAthlete = prenomA;
        this.sexeAthlete = sexeA;
        this.force = force;
        this.agilite = agilite;
        this.endurance = endurance;
    }

    /**
     * Retourne le nom et prénom de l'athlète.
     * @return le nom et prénom.
     */
    @Override
    public String obtenirNom() {
        return this.nomAthlete + " " + this.prenomAthlete;
    }
    
    /**
     * Retourne le sexe de l'athlète.
     * @return le genre.
     */
    public char getSexeAthlete() {
        return this.sexeAthlete;
    }

    /**
     * Retourne la force de l'athlète.
     * @return sa force.
     */
    public int getForce() {
        return this.force;
    }

    /**
     * Modifie la force de l'athlète.
     */
    public void setForce(int force) {
        this.force = force;
    }

    /**
     * Retourne l'agilité de l'athlète.
     * @return son agilité.
     */
    public int getAgilite() {
        return this.agilite;
    }

    /**
     * Modifie l'agilité de l'athlète.
     */
    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    /**
     * Retourne l'endurance de l'athlète.
     * @return son endurance.
     */
    public int getEndurance() {
        return this.endurance;
    }

    /**
     * Modifie l'endurance de l'athlète.
     */
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public int participer() {
        // TODO Auto-generated method stub
        return 0;
    }
}
