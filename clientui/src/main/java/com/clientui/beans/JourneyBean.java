package com.clientui.beans;

import java.util.Date;
import java.util.List;

public abstract class JourneyBean {
	
	private Long journeyId;
	private Long originLocationCodeId;
	private Long destinationLocationCodeId;
	private Long operatingCompanyId;
	private Date startDate;
	private Date endDate;
	private List<Long> customerIds;
	
	public JourneyBean() {
		super();
	}

	public JourneyBean(Long journeyId, Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId,
			Date startDate, Date endDate, List<Long> customerIds) {
		super();
		this.journeyId = journeyId;
		this.originLocationCodeId = originLocationCodeId;
		this.destinationLocationCodeId = destinationLocationCodeId;
		this.operatingCompanyId = operatingCompanyId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.customerIds = customerIds;
	}

	public JourneyBean(Long originLocationCodeId, Long destinationLocationCodeId, Long operatingCompanyId, Date startDate,
			Date endDate, List<Long> customerIds) {
		super();
		this.originLocationCodeId = originLocationCodeId;
		this.destinationLocationCodeId = destinationLocationCodeId;
		this.operatingCompanyId = operatingCompanyId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.customerIds = customerIds;
	}

	public Long getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(Long journeyId) {
		this.journeyId = journeyId;
	}

	public Long getOriginLocationCodeId() {
		return originLocationCodeId;
	}

	public void setOriginLocationCodeId(Long originLocationCodeId) {
		this.originLocationCodeId = originLocationCodeId;
	}

	public Long getDestinationLocationCodeId() {
		return destinationLocationCodeId;
	}

	public void setDestinationLocationCodeId(Long destinationLocationCodeId) {
		this.destinationLocationCodeId = destinationLocationCodeId;
	}

	public Long getOperatingCompanyId() {
		return operatingCompanyId;
	}

	public void setOperatingCompanyId(Long operatingCompanyId) {
		this.operatingCompanyId = operatingCompanyId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Long> getCustomerIds() {
		return customerIds;
	}

	public void setCustomerIds(List<Long> customerIds) {
		this.customerIds = customerIds;
	}

	@Override
	public String toString() {
		return "Journey [journeyId=" + journeyId + ", originLocationCodeId=" + originLocationCodeId
				+ ", destinationLocationCodeId=" + destinationLocationCodeId + ", operatingCompanyId="
				+ operatingCompanyId + ", startDate=" + startDate + ", endDate=" + endDate + ", customerIds="
				+ customerIds + "]";
	}

}
