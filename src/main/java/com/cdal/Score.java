package main.java.com.cdal;
public class Score {
    
    private int position;
    private double score;

    private Participant participant;

    public Score(double res, int place, Participant participant) {
        this.score = res;
        this.position = place;
        this.participant = participant;
        participant.setPlacement(place);
    }

    public double getScore() {
        return this.score;
    }

    public int getPlacement(){
        return this.position;
    }

    
}
