package com.ps.cricketservice.model;

import java.util.List;

public class Summary {
	
	private Team team;
	
	private List<Player> players;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Summary [team=" + team + ", players=" + players + "]";
	}
	
	
}
