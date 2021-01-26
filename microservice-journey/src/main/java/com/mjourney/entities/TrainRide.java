package com.mjourney.entities;

import java.util.Date;
import java.util.List;

public class TrainRide extends Journey{

	private static final long serialVersionUID = 1L;

	public TrainRide() {
		super();
	}

	public TrainRide(Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId, Date startDate,
			Date endDate, List<Long> customerIds) {
		super(originLocationCodeId, destinationLocationCodeId, operatingCompanyId, startDate, endDate, customerIds);
	}

	public TrainRide(Long journeyId, Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId,
			Date startDate, Date endDate, List<Long> customerIds) {
		super(journeyId, originLocationCodeId, destinationLocationCodeId, operatingCompanyId, startDate, endDate, customerIds);
	}

	@Override
	public String toString() {
		return "TrainRide [getJourneyId()=" + getJourneyId() + ", getOriginLocationCodeId()="
				+ getOriginLocationCodeId() + ", getDestinationLocationCodeId()=" + getDestinationLocationCodeId()
				+ ", getOperatingCompanyId()=" + getOperatingCompanyId() + ", getStartDate()=" + getStartDate()
				+ ", getEndDate()=" + getEndDate() + ", getCustomerIds()=" + getCustomerIds() + "]";
	}
	
}
