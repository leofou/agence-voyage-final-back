package com.mjourney.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Journey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long   journeyId;
	private Location originLocationCode;
	private Location destinationLocationCode;
	private OperatingCompany operatingCompany;
	private Date startDate;
	private Date endDate;
	

}
