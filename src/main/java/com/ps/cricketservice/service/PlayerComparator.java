package com.ps.cricketservice.service;

import java.util.Comparator;

import com.ps.cricketservice.model.Player;

public class PlayerComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if(o2.getRunsScored() >= o1.getRunsScored())
			return 1;
		return -1;
	}

}
