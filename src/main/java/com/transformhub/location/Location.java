package com.transformhub.location;

public class Location {

	private String locationName;
	private String locationAddress;
	private Double locationDistance;
	
	
	public Location(String locationName, String locationAddress, Double locationDistance) {
		super();
		this.locationName = locationName;
		this.locationAddress = locationAddress;
		this.locationDistance = locationDistance;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationAddress() {
		return locationAddress;
	}
	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}
	public Double getLocationDistance() {
		return locationDistance;
	}
	public void setLocationDistance(Double locationDistance) {
		this.locationDistance = locationDistance;
	}
	@Override
	public String toString() {
		return "Location [locationName=" + locationName + ", locationAddress=" + locationAddress + ", locationDistance="
				+ locationDistance + "]";
	}
	
	
	
}
