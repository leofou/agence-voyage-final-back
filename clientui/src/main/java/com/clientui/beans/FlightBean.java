package com.clientui.beans;

import java.util.Date;
import java.util.List;

public class FlightBean extends JourneyBean{
	
	private Long flightNumber;

	public FlightBean() {
		super();
	}

	public FlightBean(Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId, Date startDate,
			Date endDate, List<Long> customerIds, Long flightNumber) {
		super(originLocationCodeId, destinationLocationCodeId, operatingCompanyId, startDate, endDate, customerIds);
		this.flightNumber = flightNumber;
	}

	public FlightBean(Long journeyId, Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId,
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
