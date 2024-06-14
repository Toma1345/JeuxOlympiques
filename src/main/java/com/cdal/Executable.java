package main.java.com.cdal;
public class Executable {
    public static void main(String[] args) throws Exception {
        /** Création des 8 sports */
        Sport hand = new HandBall();
        Sport volley = new VolleyBall();
        Sport fleuret = new Escrime("Fleuret");
        Sport epee = new Escrime("Épée");
        Sport haies = new Athletisme(110);
        Sport relais = new Athletisme(400);
        Sport brasse = new Natation(100);
        Sport nageLibre = new Natation(400);

        /** Création des 16 épreuves */
        Epreuve brasseH = new Epreuve("100m brasse Homme", 'H', brasse);
        Epreuve brasseF = new Epreuve("100m brasse Femme", 'F', brasse);
        Epreuve nageH = new Epreuve("4x100m nage libre Homme", 'H', nageLibre);
        Epreuve nageF = new Epreuve("4x100m nage libre Femme", 'F', nageLibre);
        Epreuve relaisH = new Epreuve("4x100m relais Homme", 'H', relais);
        Epreuve relaisF = new Epreuve("4x100m relais Femme", 'F', relais);
        Epreuve haiesH = new Epreuve("110m haies Homme", 'H', haies);
        Epreuve haiesF = new Epreuve("110m haies Femme", 'F', haies);
        Epreuve epeeH = new Epreuve("Épée Homme", 'H', epee);
        Epreuve epeeF = new Epreuve("Épée Femme", 'F', epee);
        Epreuve fleretH = new Epreuve("Fleuret Homme", 'H', fleuret);
        Epreuve fleretF = new Epreuve("Fleuret Femme", 'F', fleuret);
        Epreuve volleyH = new Epreuve("VolleyBall Homme", 'H', volley);
        Epreuve volleyF = new Epreuve("VolleyBall Femme", 'F', volley);
        Epreuve handH = new Epreuve("HandBall Homme", 'H', hand);
        Epreuve handF = new Epreuve("HandBall Femme", 'F', hand);

        /** Initialisation-Création Jeux Olympiques */
        JeuxOlympiques jO = new JeuxOlympiques();

        /** Ajout d'épreuve au Jeux Olympiques */
        jO.ajouterEpreuve(brasseH);
        jO.ajouterEpreuve(brasseF);
        jO.ajouterEpreuve(nageH);
        jO.ajouterEpreuve(nageF);
        jO.ajouterEpreuve(relaisH);
        jO.ajouterEpreuve(relaisF);
        jO.ajouterEpreuve(haiesH);
        jO.ajouterEpreuve(haiesF);
        jO.ajouterEpreuve(epeeH);
        jO.ajouterEpreuve(epeeF);
        jO.ajouterEpreuve(fleretH);
        jO.ajouterEpreuve(fleretF);
        jO.ajouterEpreuve(volleyH);
        jO.ajouterEpreuve(volleyF);
        jO.ajouterEpreuve(handH);
        jO.ajouterEpreuve(handF);

        System.out.println(jO.getLesEpreuves());

        /** Création des Pays */
        Pays japon = new Pays("Japon");
        Pays kenya = new Pays("Kenya");
        Pays allemagne = new Pays("AAlemagne");
        Pays brésil = new Pays("Brésil");
        Pays france = new Pays("France");
        Pays chine = new Pays("Chine");
        Pays australie = new Pays("Australie");
        Pays maroc = new Pays("Maroc");
        Pays usa = new Pays("USA");
        Pays turquie = new Pays("Turquie");


        /** Création des athlètes */


        /** Ajout d'athlètes au Jeux Olympiques */


        /** Création d'une équipe */


        /** Ajout d'une équipe au Jeux Olympiques */


        /**  Ajouts de résultats */


        /** Affichages des athlètes */


        /** Affichages des équipes */


        /** Affichages des épreuves */


        /** Tri selon score total des athlètes */


        /** Tri selon ... */


    }
}
