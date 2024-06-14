package main.java.com.cdal;
import java.util.ArrayList;
import java.util.List;

public class Equipe implements Participant{
    
    private String nomEquipe;
    private int nbOr = 0;
    private int nbArgent = 0;
    private int nbBronze = 0;
    private List<Athlete> lesMembres;
    private List<Epreuve> lesEpreuves;
    
    public Equipe(String nomEquipe){
        this.nomEquipe = nomEquipe;
        this.lesMembres = new ArrayList<>();
        this.lesEpreuves = new ArrayList<>();
    }

    public void ajouteAthlete(Athlete athlete){
        Pays paysEquipe = getPaysEquipe();
        if (athlete.getPaysAthlete().equals(paysEquipe)) {
            this.lesMembres.add(athlete);
        }
        else {System.out.println("L'athlète qui a voulu être ajouté n'est pas du même pays que les autres athlètes de l'équipe !");}
    }

    @Override
    public void setPlacement(int place){
        if (place == 1) {this.nbOr++;}
        if (place == 2) {this.nbArgent++;}
        if (place == 3) {this.nbBronze++;}
    }

    public Pays getPaysEquipe() {
        return this.lesMembres.get(0).getPaysAthlete();
    }

    public void ajouteEpreuve(Epreuve epreuve){
        this.lesEpreuves.add(epreuve);
    }

    @Override
    public String obtenirNom(){
        return this.nomEquipe;
    }

    @Override
    public double participer(Epreuve epreuve) {
        Score unScore = epreuve.getScore(this);
        return unScore.getScore();
    }

    @Override
    public int getPlacement(Epreuve epreuve) {
        Score unScore = epreuve.getScore(this);
        return unScore.getPlacement();
    }

    @Override
    public String toString(){
        String res = "Nom de l'équipe: "+this.nomEquipe + System.lineSeparator();
        res += "Nationalité de l'équipe: "+this.lesMembres.get(0).getPaysAthlete();
        res += "Liste des athlètes: ";  
        for (Athlete athlete: this.lesMembres){
            res += athlete + ", ";
        }
        return res;
    }
}
