package com.mlocation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.mlocation.enumeration.LocationType;

@Entity
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long   codeLocation;
	private String locationName;
	private LocationType locationType;
	
	
	public Location() {
		super();
	
	}


	public long getCodeLocation() {
		return codeLocation;
	}


	public void setCodeLocation(long codeLocation) {
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
