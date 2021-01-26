package com.clientui.beans;

import java.util.ArrayList;
import java.util.List;

public class OperatingCompanyBean {
	private Long idOperatingComany;
	private String operatingCompanyName;
	private String operatingCompanyDetails;
	private List<Long> journeyIds = new ArrayList<Long>();
	
	
	public OperatingCompanyBean() {
		super();
	}

	public OperatingCompanyBean(String operatingCompanyName, String operatingCompanyDetails, List<Long> journeyIds) {
		super();
		this.operatingCompanyName = operatingCompanyName;
		this.operatingCompanyDetails = operatingCompanyDetails;
		this.journeyIds = journeyIds;
	}

	public OperatingCompanyBean(String operatingCompanyName, String operatingCompanyDetails) {
		super();
		this.operatingCompanyName = operatingCompanyName;
		this.operatingCompanyDetails = operatingCompanyDetails;
	}

	public Long getIdOperatingComany() {
		return idOperatingComany;
	}

	public void setIdOperatingComany(Long idOperatingComany) {
		this.idOperatingComany = idOperatingComany;
	}

	public String getOperatingCompanyName() {
		return operatingCompanyName;
	}

	public void setOperatingCompanyName(String operatingCompanyName) {
		this.operatingCompanyName = operatingCompanyName;
	}

	public String getOperatingCompanyDetails() {
		return operatingCompanyDetails;
	}

	public void setOperatingCompanyDetails(String operatingCompanyDetails) {
		this.operatingCompanyDetails = operatingCompanyDetails;
	}

	public List<Long> getJourneyIds() {
		return journeyIds;
	}

	public void setJourneyIds(List<Long> journeyIds) {
		this.journeyIds = journeyIds;
	}

	@Override
	public String toString() {
		return "OperatingCompany [idOperatingComany=" + idOperatingComany + ", operatingCompanyName="
				+ operatingCompanyName + ", operatingCompanyDetails=" + operatingCompanyDetails + ", journeyIds="
				+ journeyIds + "]";
	}

	
	
}
