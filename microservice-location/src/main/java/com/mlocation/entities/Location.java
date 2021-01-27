package com.mlocation.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.mlocation.enumeration.LocationType;

@Entity
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long   codeLocation;
	private String locationName;
	@Enumerated(EnumType.STRING)
	private LocationType locationType;
	@ElementCollection(targetClass=Long.class)
	private List<Long> originLocationCode = new ArrayList<Long>();
	@ElementCollection(targetClass=Long.class)
	private List<Long> destinationLocationCode = new ArrayList<Long>();
	
	
	
	public Location(String locationName, LocationType locationType) {
		super();
		this.locationName = locationName;
		this.locationType = locationType;
	}


	public Location() {
		super();
	
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


	public long getCodeLocation() {
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


	public LocationType getLocationType() {
		return locationType;
	}


	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}


	public Location(long codeLocation, String locationName, LocationType locationType) {
		super();
		this.codeLocation = codeLocation;
		this.locationName = locationName;
		this.locationType = locationType;
	}


	@Override
	public String toString() {
		return "Location [codeLocation=" + codeLocation + ", locationName=" + locationName + ", locationType="
				+ locationType + "]";
	}
	
	
	

}
