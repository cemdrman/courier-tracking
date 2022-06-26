package com.migros.model;

public class Point {

	private Double latitude;
	private Double longitude;

	public Point(Double latitude, Double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLat(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLang(Double longitude) {
		this.longitude = longitude;
	}

}
