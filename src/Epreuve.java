public class Epreuve {
    
    private char genre;

    private Sport sport;

    public Epreuve(char genre, Sport sport) {
        this.genre = genre;
        this.sport = sport;
    }

    public char getGenre() {
        return this.genre;
    }

    public Sport getSport() {
        return this.sport;
    }
}
