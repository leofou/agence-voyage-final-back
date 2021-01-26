package com.mjourney.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Journey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long   journeyId;
	private Location originLocationCode;
	private Location destinationLocationCode;
	private OperatingCompany operatingCompany;
	private Date startDate;
	private Date endDate;
	
	public Journey() {
		super();
	}

	public Journey(long journeyId, Location originLocationCode, Location destinationLocationCode,
			OperatingCompany operatingCompany, Date startDate, Date endDate) {
		super();
		this.journeyId = journeyId;
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
		this.operatingCompany = operatingCompany;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public long getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(long journeyId) {
		this.journeyId = journeyId;
	}

	public Location getOriginLocationCode() {
		return originLocationCode;
	}

	public void setOriginLocationCode(Location originLocationCode) {
		this.originLocationCode = originLocationCode;
	}

	public Location getDestinationLocationCode() {
		return destinationLocationCode;
	}

	public void setDestinationLocationCode(Location destinationLocationCode) {
		this.destinationLocationCode = destinationLocationCode;
	}

	public OperatingCompany getOperatingCompany() {
		return operatingCompany;
	}

	public void setOperatingCompany(OperatingCompany operatingCompany) {
		this.operatingCompany = operatingCompany;
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
	

	
	
}
