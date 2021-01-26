package com.clientui.beans;

import java.util.Date;
import java.util.List;

public class CustomerBean {

	private Long   customerId;
	private String customerName;
	private Date dateBecomeCustomer;
	private String email;
	private Integer phoneNumber;
	private List<Long> journeyIds;

	
	//constructeurs
	public CustomerBean() {
		super();
	}
	public CustomerBean(String customerName, Date dateBecomeCustomer, String email, Integer phoneNumber,
			List<Long> journeyIds) {
		super();
		this.customerName = customerName;
		this.dateBecomeCustomer = dateBecomeCustomer;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.journeyIds = journeyIds;
	}

	public CustomerBean(Long customerId, String customerName, Date dateBecomeCustomer, String email, Integer phoneNumber,
			List<Long> journeyIds) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateBecomeCustomer = dateBecomeCustomer;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.journeyIds = journeyIds;
	}
	
	//getter et setter
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getDateBecomeCustomer() {
		return dateBecomeCustomer;
	}
	public void setDateBecomeCustomer(Date dateBecomeCustomer) {
		this.dateBecomeCustomer = dateBecomeCustomer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<Long> getJourneyIds() {
		return journeyIds;
	}
	public void setJourneyIds(List<Long> journeyIds) {
		this.journeyIds = journeyIds;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", dateBecomeCustomer="
				+ dateBecomeCustomer + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

}
