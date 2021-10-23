package com.appstracta.bean;

import java.io.Serializable;
import java.util.Date;

public class City implements Serializable {

	private static final long serialVersionUID = 6553860120104804525L;
	private int id;
	private String city;
	private String status;
	private Date update;
	private Country country;

	public City() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City{" +
				"id=" + id +
				", city='" + city + '\'' +
				", status='" + status + '\'' +
				", update=" + update +
				", country=" + country +
				'}';
	}

}
