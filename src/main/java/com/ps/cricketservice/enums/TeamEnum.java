package com.ps.cricketservice.enums;

public enum TeamEnum {
	ENG("England"),
	PAK("Pakistan");
	
	private final String team;
	
	private TeamEnum(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}
}
	
