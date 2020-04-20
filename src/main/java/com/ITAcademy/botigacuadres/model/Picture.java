package com.ITAcademy.botigacuadres.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Picture {

	private @Id @GeneratedValue Long id;

	private String author;
	private String pictureName;
	private int price;
	private Date date;

	public Picture() {
	}

	public Picture(String author, String pictureName, int price, Date date, Shop shop) {
		super();
		this.author = author;
		this.pictureName = pictureName;
		this.price = price;
		this.date = date;
		this.shop = shop;
	}

	@ManyToOne
	private Shop shop;

	public Long getid() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date = new Date();
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

}
