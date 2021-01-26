package com.mjourney.entities;

import java.util.Date;
import java.util.List;

public class RiverCruise extends Journey {

	private static final long serialVersionUID = 1L;
	
	private String nameOfTheBoat;
	private String portOfRegistration;
	
	public RiverCruise() {
		super();
	}

	public RiverCruise(Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId,
			Date startDate, Date endDate, List<Long> customerIds, String nameOfTheBoat, String portOfRegistration) {
		super(originLocationCodeId, destinationLocationCodeId, operatingCompanyId, startDate, endDate, customerIds);
		this.nameOfTheBoat = nameOfTheBoat;
		this.portOfRegistration = portOfRegistration;
	}

	public RiverCruise(Long journeyId, Long originLocationCodeId, Long destinationLocationCodeId,
			Long operatingCompanyId, Date startDate, Date endDate, List<Long> customerIds, String nameOfTheBoat, String portOfRegistration) {
		super(journeyId, originLocationCodeId, destinationLocationCodeId, operatingCompanyId, startDate, endDate, customerIds);
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

	@Override
	public String toString() {
		return "RiverCruise [nameOfTheBoat=" + nameOfTheBoat + ", portOfRegistration=" + portOfRegistration
				+ ", getJourneyId()=" + getJourneyId() + ", getOriginLocationCodeId()=" + getOriginLocationCodeId()
				+ ", getDestinationLocationCodeId()=" + getDestinationLocationCodeId() + ", getOperatingCompanyId()="
				+ getOperatingCompanyId() + ", getStartDate()=" + getStartDate() + ", getEndDate()=" + getEndDate()
				+ ", getCustomerIds()=" + getCustomerIds() + "]";
	}
	

	

}
