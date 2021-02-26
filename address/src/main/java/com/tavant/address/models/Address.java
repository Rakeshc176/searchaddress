package com.tavant.address.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="addr")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String houseNumber;
	private String houseName;
	private String poi;
	private String street;
	private String subSubLocality;
	private String subLocality;
	private String locality;
	private String village;
	private String subDistrict;
	private String district;
	private String city;
	private String state;
	private String pincode;
	private String formattedAddress;
	
	private String geocodeLevel;
	private String confidenceScore;
	private String eLoc;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getPoi() {
		return poi;
	}
	public void setPoi(String poi) {
		this.poi = poi;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getSubSubLocality() {
		return subSubLocality;
	}
	public void setSubSubLocality(String subSubLocality) {
		this.subSubLocality = subSubLocality;
	}
	public String getSubLocality() {
		return subLocality;
	}
	public void setSubLocality(String subLocality) {
		this.subLocality = subLocality;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getSubDistrict() {
		return subDistrict;
	}
	public void setSubDistrict(String subDistrict) {
		this.subDistrict = subDistrict;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getFormattedAddress() {
		return formattedAddress;
	}
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	public String geteLoc() {
		return eLoc;
	}
	public void seteLoc(String eLoc) {
		this.eLoc = eLoc;
	}
	public String getGeocodeLevel() {
		return geocodeLevel;
	}
	public void setGeocodeLevel(String geocodeLevel) {
		this.geocodeLevel = geocodeLevel;
	}
	public String getConfidenceScore() {
		return confidenceScore;
	}
	public void setConfidenceScore(String confidenceScore) {
		this.confidenceScore = confidenceScore;
	}
	public Address( String houseNumber, String houseName, String poi, String street, String subSubLocality,
			String subLocality, String locality, String village, String subDistrict, String district, String city,
			String state, String pincode, String formattedAddress, String geocodeLevel,
			String confidenceScore, String eLoc) {
		super();
		
		this.houseNumber = houseNumber;
		this.houseName = houseName;
		this.poi = poi;
		this.street = street;
		this.subSubLocality = subSubLocality;
		this.subLocality = subLocality;
		this.locality = locality;
		this.village = village;
		this.subDistrict = subDistrict;
		this.district = district;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.formattedAddress = formattedAddress;
		
		this.geocodeLevel = geocodeLevel;
		this.confidenceScore = confidenceScore;
		this.eLoc = eLoc;
	}
	public Address() {
		super();
	}

}
