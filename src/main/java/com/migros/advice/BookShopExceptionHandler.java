package com.migros.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.migros.exception.CourierTrakingException;

@ControllerAdvice
public class BookShopExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<String> handle(Exception ex, WebRequest request) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(CourierTrakingException.class)
	public final ResponseEntity<String> handle(CourierTrakingException ex, WebRequest request) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
