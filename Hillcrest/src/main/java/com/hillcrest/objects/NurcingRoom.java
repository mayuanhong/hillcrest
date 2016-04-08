package com.hillcrest.objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Entity
public class NurcingRoom {

	private String title;
	private String name;
	private String address;
	private String phone;
	private double latitude;
	private double longitude;

	@JsonCreator
	public NurcingRoom(@JsonProperty("Name") String name, @JsonProperty("Address") String address,
			@JsonProperty("Phone") String phone, @JsonProperty("Latitude") double latitude,
			@JsonProperty("Longitude") double longitude) {

		this.title = "From Json File";
		this.name = name;
		this.address = address;
		this.address = phone;
		this.latitude = latitude;
		this.longitude = longitude;

	}

	public NurcingRoom(String title, String name, String address, String phone, double latitude, double longitude) {
		super();
		this.title = title;
		this.name = name;
		this.address = address;
		this.address = phone;
		this.latitude = latitude;
		this.longitude = longitude;

	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "NurcingRoom [title=" + title + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", latutide=" + latitude + ", longtidide=" + longitude + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}