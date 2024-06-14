package main.java.com.cdal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JeuxOlympiques {
    
    private Set<Epreuve> lesEpreuves;
    private List<Athlete> lesAthletes;
    private List<Equipe> lesEquipes;

    public JeuxOlympiques() {
        this.lesEpreuves = new HashSet();
        this.lesAthletes = new ArrayList<>();
        this.lesEquipes = new ArrayList<>();
    }

    public Set<Epreuve> getLesEpreuves() {
        return this.lesEpreuves;
    }

    public void ajouterEpreuve(Epreuve epreuve) {
        this.lesEpreuves.add(epreuve);
    }

    public void retirerEpreuve(Epreuve epreuve) {
        this.lesEpreuves.remove(epreuve);
    }


    public List<Athlete> getLesAthletes() {
        return this.lesAthletes;
    }

    public void ajouterAthlete(Athlete athlete) {
        this.lesAthletes.add(athlete);
    }

    public void retirerAthlete(Athlete athlete) {
        this.lesAthletes.remove(athlete);
    }
    

    public List<Equipe> getLesEquipes() {
        return this.lesEquipes;
    }

    public void ajouterEquipe(Equipe equipe) {
        this.lesEquipes.add(equipe);
    }

    public void retirerEquipe(Equipe equipe) {
        this.lesEquipes.remove(equipe);
    }
}
