package model;

public class Player {
    private String name;

    private int runsScored;

    private int numberOfBallsFaced;

    private int numberOfWicketsTaken;

    private float numberOfOversBowled;

    private int totalRunsGiven;

    private Team team;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getNumberOfBallsFaced() {
        return numberOfBallsFaced;
    }

    public void setNumberOfBallsFaced(int numberOfBallsFaced) {
        this.numberOfBallsFaced = numberOfBallsFaced;
    }

    public int getNumberOfWicketsTaken() {
        return numberOfWicketsTaken;
    }

    public void setNumberOfWicketsTaken(int numberOfWicketsTaken) {
        this.numberOfWicketsTaken = numberOfWicketsTaken;
    }

    public float getNumberOfOversBowled() {
        return numberOfOversBowled;
    }

    public void setNumberOfOversBowled(float numberOfOversBowled) {
        this.numberOfOversBowled = numberOfOversBowled;
    }

    public int getTotalRunsGiven() {
        return totalRunsGiven;
    }

    public void setTotalRunsGiven(int totalRunsGiven) {
        this.totalRunsGiven = totalRunsGiven;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", runsScored=" + runsScored +
                ", numberOfBallsFaced=" + numberOfBallsFaced +
                ", numberOfWicketsTaken=" + numberOfWicketsTaken +
                ", numberOfOversBowled=" + numberOfOversBowled +
                ", totalRunsGiven=" + totalRunsGiven +
                '}';
    }
}
