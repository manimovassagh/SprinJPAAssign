package com.github.com.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	private String family;
	@Embedded
	private Address address;

	public Customer() {
		super();
	}
	public Customer(int id, String name, String family, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", family=" + family + ", address=" + address + "]";
	}
	

}
