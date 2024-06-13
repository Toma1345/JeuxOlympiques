import java.util.ArrayList;
import java.util.List;

public class Equipe implements Participant{
    
    private String nomEquipe;
    private List<Athlete> lesMembres;
    private List<Epreuve> lesEpreuves;
    
    public Equipe(String nomEquipe){
        this.nomEquipe = nomEquipe;
        this.lesMembres = new ArrayList<>();
        this.lesEpreuves = new ArrayList<>();
    }

    public void ajouteAthlete(Athlete athlete){
        this.lesMembres.add(athlete);
    }

    public void ajouteEpreuve(Epreuve epreuve){
        this.lesEpreuves.add(epreuve);
    }

    @Override
    public String obtenirNom(){
        return this.nomEquipe;
    }

    @Override
    public int participer(Epreuve epreuve) {
        int score = 0;
        for (Athlete sportif : this.lesMembres){
            score += sportif.participer(epreuve);
        } 
        return score;
    }
}
