package com.offerapi.entity;

import java.util.Date;

import com.offerapi.domain.PublicEnum.StatusType;

public class Offer {
	private Integer id;
	private String description;
	private Date expiryDate;
	private StatusType status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public StatusType getStatus() {
		return status;
	}
	public void setStatus(StatusType status) {
		this.status = status;
	}
	
	
	
	
}
