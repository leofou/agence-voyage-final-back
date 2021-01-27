package com.mjourney.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Flight extends Journey{

	private static final long serialVersionUID = 1L;
	
	private Long flightNumber;

	public Flight() {
		super();
	}

	public Flight(Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId, Date startDate,
			Date endDate, List<Long> customerIds, Long flightNumber) {
		super(originLocationCodeId, destinationLocationCodeId, operatingCompanyId, startDate, endDate, customerIds);
		this.flightNumber = flightNumber;
	}

	public Flight(Long journeyId, Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId,
			Date startDate, Date endDate, List<Long> customerIds, Long flightNumber) {
		super(journeyId, originLocationCodeId, destinationLocationCodeId, operatingCompanyId, startDate, endDate, customerIds);
		this.flightNumber = flightNumber;
	}

	public Long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Long flightNumber) {
		this.flightNumber = flightNumber;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", getJourneyId()=" + getJourneyId()
				+ ", getOriginLocationCodeId()=" + getOriginLocationCodeId() + ", getDestinationLocationCodeId()="
				+ getDestinationLocationCodeId() + ", getOperatingCompanyId()=" + getOperatingCompanyId()
				+ ", getStartDate()=" + getStartDate() + ", getEndDate()=" + getEndDate() + ", getCustomerIds()="
				+ getCustomerIds() + "]";
	}

	
	

}
