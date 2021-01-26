package com.clientui.beans;

import java.util.Date;
import java.util.List;

public class RiverCruiseBean extends JourneyBean{
	
	private String nameOfTheBoat;
	private String portOfRegistration;
	
	public RiverCruiseBean() {
		super();
	}

	public RiverCruiseBean(Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId,
			Date startDate, Date endDate, List<Long> customerIds, String nameOfTheBoat, String portOfRegistration) {
		super(originLocationCodeId, destinationLocationCodeId, operatingCompanyId, startDate, endDate, customerIds);
		this.nameOfTheBoat = nameOfTheBoat;
		this.portOfRegistration = portOfRegistration;
	}

	public RiverCruiseBean(Long journeyId, Long originLocationCodeId, Long destinationLocationCodeId,
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
