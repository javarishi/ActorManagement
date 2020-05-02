package com.h2kinfosys.learn.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SKU")
public class Sku {
	
	public Sku() {
		// TODO Auto-generated constructor stub
	}
	
	@Id @Column(name="SKU_NUMBER")
	private int skuNumber;
	
	@Column(name="SKU_DESC")
	private String skuDescription;
	@Column(name="SKU_TYPE")
	private String skuType;
	@Column(name="SKU_DETAILS")
	private String skuDetails;
	@Column(name="SPCL_MARKET", length = 1)
	private String specialMarket;
	
	public int getSkuNumber() {
		return skuNumber;
	}
	public void setSkuNumber(int skuNumber) {
		this.skuNumber = skuNumber;
	}
	public String getSkuDescription() {
		return skuDescription;
	}
	public void setSkuDescription(String skuDescription) {
		this.skuDescription = skuDescription;
	}
	public String getSkuType() {
		return skuType;
	}
	public void setSkuType(String skuType) {
		this.skuType = skuType;
	}
	public String getSkuDetails() {
		return skuDetails;
	}
	public void setSkuDetails(String skuDetails) {
		this.skuDetails = skuDetails;
	}
	public String getSpecialMarket() {
		return specialMarket;
	}
	public void setSpecialMarket(String specialMarket) {
		this.specialMarket = specialMarket;
	}

	
}
