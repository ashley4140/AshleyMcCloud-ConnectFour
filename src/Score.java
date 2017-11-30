import javax.swing.*;

public class Score {
    private int wins;
    private int losses;

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public Score(int wins, int losses) {

        setWins(wins);
        setLosses(losses);
    }

    public Score() {
        wins = 0;
        losses = 0;
    }
}




