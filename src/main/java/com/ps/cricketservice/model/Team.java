package com.ps.cricketservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team {

    @JsonProperty("team_name")
    private String name;

    @JsonProperty("team_score")
    private int totalSore;

    @JsonProperty("total_wickets_fallen")
    private int numberOfWicketsFallen;

    @JsonProperty("overs_played")
    private float numberOfOvers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalSore() {
        return totalSore;
    }

    public void setTotalSore(int totalSore) {
        this.totalSore = totalSore;
    }

    public int getNumberOfWicketsFallen() {
        return numberOfWicketsFallen;
    }

    public void setNumberOfWicketsFallen(int numberOfWicketsFallen) {
        this.numberOfWicketsFallen = numberOfWicketsFallen;
    }

    public float getNumberOfOvers() {
        return numberOfOvers;
    }

    public void setNumberOfOvers(float numberOfOvers) {
        this.numberOfOvers = numberOfOvers;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", totalSore=" + totalSore +
                ", numberOfWicketsFallen=" + numberOfWicketsFallen +
                ", numberOfOvers=" + numberOfOvers +
                '}';
    }
}
