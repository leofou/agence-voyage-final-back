package com.mjourney.entities;

import java.util.Date;

public class RiverCruise extends Journey {

	private static final long serialVersionUID = 1L;
	
	private String nameOfTheBoat;
	private String portOfRegistration;
	
	public RiverCruise() {
		super();
	}

	public RiverCruise(String nameOfTheBoat, String portOfRegistration) {
		super();
		this.nameOfTheBoat = nameOfTheBoat;
		this.portOfRegistration = portOfRegistration;
	}

	public RiverCruise(long journeyId, Location originLocationCode, Location destinationLocationCode,
			OperatingCompany operatingCompany, Date startDate, Date endDate, String nameOfTheBoat,
			String portOfRegistration) {
		super(journeyId, originLocationCode, destinationLocationCode, operatingCompany, startDate, endDate);
		this.nameOfTheBoat = nameOfTheBoat;
		this.portOfRegistration = portOfRegistration;
	}

	public String getNameOfTheBoat() {
		return nameOfTheBoat;
	}

	public void setNameOfTheBoat(String nameOfTheBoat) {
		this.nameOfTheBoat = nameOfTheBoat;
	}

	public String getPortOfRegistration() {
		return portOfRegistration;
	}

	public void setPortOfRegistration(String portOfRegistration) {
		this.portOfRegistration = portOfRegistration;
	}
	
	
	
	

}
