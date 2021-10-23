package com.appstracta.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Country implements Serializable {

	private static final long serialVersionUID = -1621101928232403292L;
	private int id;
	private String country;
	private Date update;
	private List<City> cities;

	public Country() {
	}

	public Country(int id, String country, Date update) {
		this.id = id;
		this.country = country;
		this.update = update;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Country{" +
				"id=" + id +
				", country='" + country + '\'' +
				", update=" + update +
				", cities=" + cities +
				'}';
	}

}
