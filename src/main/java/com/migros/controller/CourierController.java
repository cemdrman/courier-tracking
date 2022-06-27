package com.migros.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.migros.dto.request.CourierEntranceCountRequest;
import com.migros.enums.ServiceEnum;
import com.migros.service.CourierService;
import com.migros.service.FactoryBeanService;

@RestController
@RequestMapping(name = "/couriers")
public class CourierController {

	private CourierService courierService;

	public CourierController() {
		super();
		this.courierService = (CourierService) FactoryBeanService.getBean(ServiceEnum.COURIER_SERVICE);
	}

	@PutMapping(name = "/{courierId}")
	@ResponseStatus(code = HttpStatus.OK)
	public void countEntrance(@RequestBody CourierEntranceCountRequest request,
			@PathVariable("courierId") int courierId) {
		courierService.countEntrance(request, courierId);
	}

	@GetMapping(name = "/{courierId}")
	@ResponseStatus(code = HttpStatus.OK)
	public Double getTotalTravelDistance(@PathVariable("courierId") int courierId) {
		return courierService.getTotalTravelDistance(courierId);
	}
}
