package GameScores;

public class EqualScore extends ScoreType {
    private final TennisPlayer player1;

    EqualScore(TennisPlayer player1) {
        this.player1 = player1;
    }

    public String getScore() {
        return pointNames[player1.score] + "-All";
    }
}

