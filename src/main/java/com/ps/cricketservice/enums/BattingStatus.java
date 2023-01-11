package com.ps.cricketservice.enums;

public enum BattingStatus {
	OUT("OUT"),
	NOT_OUT("NOT OUT");
	private final String status;

	private BattingStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
}
