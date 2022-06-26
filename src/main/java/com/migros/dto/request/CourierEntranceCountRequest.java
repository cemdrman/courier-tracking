package com.migros.dto.request;

import java.time.LocalDateTime;

public class CourierEntranceCountRequest {

	private LocalDateTime entranceTime;
	private Double latitude;
	private Double longitude;

	public CourierEntranceCountRequest(LocalDateTime entranceTime, Double latitude, Double longitude) {
		super();
		this.entranceTime = entranceTime;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public LocalDateTime getEntranceTime() {
		return entranceTime;
	}

	public void setEntranceTime(LocalDateTime entranceTime) {
		this.entranceTime = entranceTime;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
