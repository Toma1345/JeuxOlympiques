
import java.util.HashMap;
import java.util.Map;

public class Epreuve {
    
    private char genre;
    private String nomEpreuve;

    private Sport sport;

    private Map<Athlete, Score> equipeResultat;

    /**
     * Construit une instance d'Epreuve
     * @param nomE le nom de l'épreuve
     * @param genre le genre de l'épreuve ('M' pour masculin ou 'F' pour féminin)
     * @param sport le sport concerné par l'épreuve
     */
    public Epreuve(String nomE, char genre, Sport sport) {
        this.nomEpreuve = nomE;
        this.genre = genre;
        this.sport = sport;
        this.equipeResultat = new HashMap<>();
    }

    public String getNomEpreuve() {
        return this.nomEpreuve;
    }

    public char getGenre() {
        return this.genre;
    }

    public Sport getSport() {
        return this.sport;
    }

    /**
     * Ajoute un résultat d'une équipe à l'épreuve
     * @param equipe une équipe
     * @param resultat son résultat
     */
    public void ajouterResultat(Athlete athlete, Score resultat) {
        this.equipeResultat.put(athlete, resultat);
    }

    /**
     * Modifie le résultat d'une équipe à l'épreuve
     * @param equipe une équipe
     * @param ancienScore son ancien score
     * @param newRes son nouveau score
     */
    public void modifierResultat(Athlete athlete, Score ancienScore, Score newRes) {
        this.equipeResultat.replace(athlete, ancienScore, newRes);
    }

    /**
     * Retire le résultat d'une équipe à l'épreuve
     * @param equipe une équipe
     * @param res son résultat
     */
    public void retirerResultat(Athlete athlete, Score res) {
        this.equipeResultat.remove(athlete, res);
    }
    
    /**
     * Retourne le score d'une équipe à l'épreuve
     * @param equipe une équipe
     * @return un Score qu'a réalisé l'équipe dans cet épreuve.
     */
    public Score getScore(Athlete athlete) {
        return this.equipeResultat.get(athlete);
    }

}
