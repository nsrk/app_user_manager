package com.example.hibernate.model;

import javax.persistence.Embeddable;

/**
 * @author Sivaramakrishna
 *
 */

/*This is the embeddable value that is used to provide value to the entity. This value has no relevance if not used by the entity*/
@Embeddable
public class Address {
	
	private String streetName;
	
	private String zipCode;
	
	private String country;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
