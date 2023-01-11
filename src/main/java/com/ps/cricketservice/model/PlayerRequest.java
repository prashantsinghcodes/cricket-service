package com.ps.cricketservice.model;

import java.util.List;

public class PlayerRequest {
	
	private List<Player> players;
	
	private List<Team> teams;

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "PlayerRequest [players=" + players + ", teams=" + teams + "]";
	}
	
	
}
