package com.github.com.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String street;
	private String city;
	private String country;
	private String state;
	private String zopcode;
	public Address(String street, String city, String country, String state, String zopcode) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zopcode = zopcode;
	}
	public Address() {
		super();
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZopcode() {
		return zopcode;
	}
	public void setZopcode(String zopcode) {
		this.zopcode = zopcode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", zopcode=" + zopcode + "]";
	}
	
	

}
