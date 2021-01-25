package com.mlocation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long   codeLocation;
	private String locationName;
	
	
	public Location(String locationName) {
		super();
		this.locationName = locationName;
	}
	public Location(long idLocation, String locationName) {
		super();
		this.codeLocation = idLocation;
		this.locationName = locationName;
	}
	public Location() {
		super();
	}
	public long getIdLocation() {
		return codeLocation;
	}
	public void setIdLocation(long idLocation) {
		this.codeLocation = idLocation;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	@Override
	public String toString() {
		return "Location [idLocation=" + codeLocation + ", locationName=" + locationName + "]";
	}
	
//	
//	
	
	

}
