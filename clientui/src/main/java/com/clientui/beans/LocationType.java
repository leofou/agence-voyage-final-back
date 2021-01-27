package com.clientui.beans;

public enum LocationType {
AIRPORT, SEAPORT, TRAINSTATION;
	
	public String getOptionText() {
		switch(this) {
		case AIRPORT:
			return "airport";
		case SEAPORT:
			return "seaport";
		case TRAINSTATION:
			return "trainStation";
		default:
			return null;
		}
	}

}
