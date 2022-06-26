package com.migros.enums;

public enum ServiceEnum {

	COURIER_SERVICE("CourierService");

	private String serviceName;

	ServiceEnum(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceName() {
		return serviceName;
	}

}
