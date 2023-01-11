package com.ps.cricketservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ps.cricketservice.enums.BattingStatus;
import com.ps.cricketservice.enums.TeamEnum;

public class Player {
	
	@JsonProperty("player_name")
    private String name;

	@JsonProperty("runs_scored")
    private int runsScored;

	@JsonProperty("balls_faced")
    private int numberOfBallsFaced;

	@JsonProperty("wickets_taken")
    private int numberOfWicketsTaken;

	@JsonProperty("overs_bowled")
    private float numberOfOversBowled;

	@JsonProperty("runs_given")
    private int totalRunsGiven;

	@JsonProperty("team_name")
    private String team;

	@JsonProperty("batting_status")
	private String battingStatus;
	
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

    public String getTeam() {
        return team;
    }

    public void setTeam(TeamEnum team) {
        this.team = team.getTeam();
    }
    
    public String getBattingStatus() {
		return battingStatus;
	}

	public void setBattingStatus(BattingStatus battingStatus) {
		this.battingStatus = battingStatus.getStatus();
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", runsScored=" + runsScored + ", numberOfBallsFaced=" + numberOfBallsFaced
				+ ", numberOfWicketsTaken=" + numberOfWicketsTaken + ", numberOfOversBowled=" + numberOfOversBowled
				+ ", totalRunsGiven=" + totalRunsGiven + ", team=" + team + ", battingStatus=" + battingStatus + "]";
	}

}
