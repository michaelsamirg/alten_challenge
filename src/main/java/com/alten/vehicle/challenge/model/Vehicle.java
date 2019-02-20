package com.alten.vehicle.challenge.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	private Long id;
	private String vehicleId;
	private String regNo;
	private int status = 0;
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "VEHICLE_CUSTOMER", 
        joinColumns = { @JoinColumn(name = "CUSTOMER_ID") }, 
        inverseJoinColumns = { @JoinColumn(name = "VEHICLE_ID") }
    )
	private Set<Customer> customers = new HashSet<Customer>(); ;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String vehicleId, String regNo) {
		super();
		this.vehicleId = vehicleId;
		this.regNo = regNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
