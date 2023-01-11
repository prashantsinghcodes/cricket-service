package com.ps.cricketservice.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ps.cricketservice.enums.TeamEnum;
import com.ps.cricketservice.model.Player;
import com.ps.cricketservice.model.PlayerRequest;
import com.ps.cricketservice.model.Summary;
import com.ps.cricketservice.model.Team;

import utils.UtilConstants;

@Service
public class CricketService {
	
	private static final String Map = null;
	Logger logger = LoggerFactory.getLogger(CricketService.class);
	
	public List<Summary> retriveSummary() {
		List<Summary> summaryList = new ArrayList<>();
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			PlayerRequest playerRequest = objectMapper.readValue(UtilConstants.json, PlayerRequest.class);
			summaryList = processRecords(playerRequest.getTeams(), playerRequest.getPlayers());
		} catch(Exception ex) {
			logger.error("Exception in method : retriveSummary with details : {}", ex.getMessage());
		}
		return summaryList;
	}
	
	public List<Summary> processRecords(List<Team> teams,List<Player> players) {
		List<Player> pakPlayers = getTeamByPlayers(players, TeamEnum.PAK.getTeam());
		List<Player> engPlayers = getTeamByPlayers(players, TeamEnum.ENG.getTeam());
		pakPlayers = getTop3Players(pakPlayers);
		engPlayers = getTop3Players(engPlayers);
		List<Summary> summaryList = new ArrayList<>();
		for(Team team : teams) {
			Summary summary = new Summary();
			if(team.getName().equals(TeamEnum.PAK.getTeam())) {
				summary.setTeam(team);
				summary.setPlayers(pakPlayers);
			} else if(team.getName().equals(TeamEnum.ENG.getTeam())) {
				summary.setTeam(team);
				summary.setPlayers(engPlayers);
			}
			summaryList.add(summary);
		}
		return summaryList;
	}

	private List<Player> getTeamByPlayers(List<Player> players, String team) {
		List<Player> teamPlayers = new ArrayList<>();
		players.forEach(player -> {
			if(player.getTeam().equals(team))
				teamPlayers.add(player);
		});
		return teamPlayers;
	}
	
	public List<Player> getTop3Players(List<Player> players) {
		Collections.sort(players, new PlayerComparator());
		return players.subList(0, 3);
	}
	
}
