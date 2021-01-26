package com.clientui.beans;

import java.util.List;

public class OperatingCompanyBean {
	private Long idOperatingComany;
	private String OperatingCompanyName;
	private String OperatingCompanyDetails;
	private List<Long> journeyIds;
	
	public OperatingCompanyBean(String operatingCompanyName, String operatingCompanyDetails, List<Long> journeyIds) {
		super();
		OperatingCompanyName = operatingCompanyName;
		OperatingCompanyDetails = operatingCompanyDetails;
		this.journeyIds = journeyIds;
	}

	public OperatingCompanyBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdOperatingComany() {
		return idOperatingComany;
	}

	public void setIdOperatingComany(Long idOperatingComany) {
		this.idOperatingComany = idOperatingComany;
	}

	public String getOperatingCompanyName() {
		return OperatingCompanyName;
	}

	public void setOperatingCompanyName(String operatingCompanyName) {
		OperatingCompanyName = operatingCompanyName;
	}

	public String getOperatingCompanyDetails() {
		return OperatingCompanyDetails;
	}

	public void setOperatingCompanyDetails(String operatingCompanyDetails) {
		OperatingCompanyDetails = operatingCompanyDetails;
	}

	public List<Long> getJourneyIds() {
		return journeyIds;
	}

	public void setJourneyIds(List<Long> journeyIds) {
		this.journeyIds = journeyIds;
	}

	@Override
	public String toString() {
		return "OperatingCompanyBean [idOperatingComany=" + idOperatingComany + ", OperatingCompanyName="
				+ OperatingCompanyName + ", OperatingCompanyDetails=" + OperatingCompanyDetails + ", journeyIds="
				+ journeyIds + "]";
	}
	
	
}
