public class Score {
    
    private int position;
    private double score;

    private Equipe participant;

    public Score(double res, int place, Equipe participant) {
        this.score = res;
        this.position = place;
        this.participant = participant;
    }

    public double getScore() {
        return this.score;
    }

    
}
