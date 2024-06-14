package main.java.com.cdal;
/**
 * L'interface Participant représente un participant dans un événement sportif.
 * Elle définit les méthodes nécessaires pour participer à un événement et obtenir le nom du participant.
 */
public interface Participant {
    
    /**
     * Participe à un événement sportif.
     * @return un entier représentant le résultat de la participation
     */
    public double participer(Epreuve epreuve);

    public int getPlacement(Epreuve epreuve);

    public void setPlacement(int place);

    /**
     * Obtient le nom du participant.
     * @return le nom du participant sous forme de chaîne de caractères
     */
    public String obtenirNom();
}