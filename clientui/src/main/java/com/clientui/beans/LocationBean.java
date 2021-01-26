package com.clientui.beans;

import java.util.List;

public class LocationBean {

	private Long   codeLocation;
	private String locationName;
	private List<Long> originLocationCode;
	private List<Long> destinationLocationCode;
	
	
	
	public LocationBean() {
		super();
	}



	public LocationBean(String locationName, List<Long> originLocationCode, List<Long> destinationLocationCode) {
		super();
		this.locationName = locationName;
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
	}



	public LocationBean(Long codeLocation, String locationName, List<Long> originLocationCode,
			List<Long> destinationLocationCode) {
		super();
		this.codeLocation = codeLocation;
		this.locationName = locationName;
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
	}



	@Override
	public String toString() {
		return "LocationBean [codeLocation=" + codeLocation + ", locationName=" + locationName + ", originLocationCode="
				+ originLocationCode + ", destinationLocationCode=" + destinationLocationCode + "]";
	}



	public Long getCodeLocation() {
		return codeLocation;
	}



	public void setCodeLocation(Long codeLocation) {
		this.codeLocation = codeLocation;
	}



	public String getLocationName() {
		return locationName;
	}



	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}



	public List<Long> getOriginLocationCode() {
		return originLocationCode;
	}



	public void setOriginLocationCode(List<Long> originLocationCode) {
		this.originLocationCode = originLocationCode;
	}



	public List<Long> getDestinationLocationCode() {
		return destinationLocationCode;
	}



	public void setDestinationLocationCode(List<Long> destinationLocationCode) {
		this.destinationLocationCode = destinationLocationCode;
	}
	
	
}
