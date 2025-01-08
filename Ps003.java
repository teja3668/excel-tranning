
class Bowler {
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    public Bowler() {
        name = "";
        wickets = 0;
        matches = 0;
        balls_bowled = 0;
        runs_conceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }
    public void computeBowlingAverage() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        double bowlingAvg = (wickets > 0) ? (double) runs_conceded / wickets : 0.0;
        System.out.println("Name: " + name);
        System.out.println("bowling_avg=" + String.format("%.1f", bowlingAvg));
    }

    public void showStatistics() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + balls_bowled);
        System.out.println("runs_conceded=" + runs_conceded);
    }

    public void computeStrikeRate() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }
        if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        double strikeRate = (balls_bowled > 0) ? (double) runs_conceded / balls_bowled : 0.0;
        System.out.println("Name: " + name);
        System.out.println("Strike_rate=" + String.format("%.8f", strikeRate));
    }
}

public class Testing {
    public static void main(String[] args) {
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);
    
        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();
    }
}
