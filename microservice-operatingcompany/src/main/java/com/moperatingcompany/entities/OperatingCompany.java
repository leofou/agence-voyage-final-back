package com.moperatingcompany.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OperatingCompany implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOperatingComany;
	private String OperatingCompanyName;
	private String OperatingCompanyDetails;
	private List<Long> journeyIds;
	
	public OperatingCompany() {
		super();
	}

	public OperatingCompany(String operatingCompanyName, String operatingCompanyDetails, List<Long> journeyIds) {
		super();
		OperatingCompanyName = operatingCompanyName;
		OperatingCompanyDetails = operatingCompanyDetails;
		this.journeyIds = journeyIds;
	}
	
	

	public OperatingCompany(String operatingCompanyName, String operatingCompanyDetails) {
		super();
		OperatingCompanyName = operatingCompanyName;
		OperatingCompanyDetails = operatingCompanyDetails;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "OperatingCompany [idOperatingComany=" + idOperatingComany + ", OperatingCompanyName="
				+ OperatingCompanyName + ", OperatingCompanyDetails=" + OperatingCompanyDetails + ", journeyIds="
				+ journeyIds + "]";
	}
	
	
	

}
