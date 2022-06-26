package com.migros.exception;

public class CourierTrakingException extends RuntimeException {

	private String message;

	public CourierTrakingException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
