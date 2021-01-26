package com.clientui.beans;

import java.util.Date;
import java.util.List;

public class TrainRideBean extends JourneyBean{
	
	public TrainRideBean() {
		super();
	}

	public TrainRideBean(Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId, Date startDate,
			Date endDate, List<Long> customerIds) {
		super(originLocationCodeId, destinationLocationCodeId, operatingCompanyId, startDate, endDate, customerIds);
	}

	public TrainRideBean(Long journeyId, Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId,
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
