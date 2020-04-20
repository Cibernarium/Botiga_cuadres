package com.ITAcademy.botigacuadres.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Shop {

	private @Id @GeneratedValue Long id;
	private String shopName; 
	private int maxPictures;
	public Long getId() {
		return id;
	}
	
	public Shop() {
	}
	
	public Shop(String shopName, int maxPictures) {
		super();
		this.shopName = shopName;
		this.maxPictures = maxPictures;
	}


	public void setId(Long id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getMaxPictures() {
		return maxPictures;
	}
	public void setMaxPictures(int maxPictures) {
		this.maxPictures = maxPictures;
	}
	
	
	
	
}
