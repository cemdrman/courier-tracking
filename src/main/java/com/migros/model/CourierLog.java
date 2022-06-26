package com.migros.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CourierLog")
public class CourierLog {

	@Id
	private String id;
	private Courier courier;
	private Store store;
	private LocalDateTime entranceTime;

	public CourierLog(Courier courier, Store store, LocalDateTime entranceTime) {
		super();
		this.courier = courier;
		this.store = store;
		this.entranceTime = entranceTime;
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public LocalDateTime getEntranceTime() {
		return entranceTime;
	}

	public void setEntranceTime(LocalDateTime entranceTime) {
		this.entranceTime = entranceTime;
	}

}
