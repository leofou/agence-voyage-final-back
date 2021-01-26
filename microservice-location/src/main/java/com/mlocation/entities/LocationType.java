package com.mlocation.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class LocationType implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String airport;
	private String seaport;
	private String trainStation;

}
