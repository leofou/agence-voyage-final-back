package com.mjourney.entities;

import java.util.Date;

public class Flight extends Journey{

	private static final long serialVersionUID = 1L;
	
	private Long flightNumber;

	public Flight() {
		super();
	}

	public Flight(Long flightNumber) {
		super();
		this.flightNumber = flightNumber;
	}

	public Flight(long journeyId, Location originLocationCode, Location destinationLocationCode,
			OperatingCompany operatingCompany, Date startDate, Date endDate, Long flightNumber) {
		super(journeyId, originLocationCode, destinationLocationCode, operatingCompany, startDate, endDate);
		this.flightNumber = flightNumber;
	}

	public Long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Long flightNumber) {
		this.flightNumber = flightNumber;
	}


}
