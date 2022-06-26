package com.migros.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.migros.model.Courier;

@Repository
public class CourierRepository {

	private static List<Courier> courierList = new ArrayList<>();

	static {
		courierList.add(new Courier(1, "kurye1", "kurye1"));
		courierList.add(new Courier(2, "kurye2", "kurye2"));
		courierList.add(new Courier(3, "kurye3", "kurye3"));
		courierList.add(new Courier(4, "kurye4", "kurye4"));
		courierList.add(new Courier(5, "kurye5", "kurye5"));
	}

	public Optional<Courier> findById(int courierId) {
		//// @formatter:off
		return courierList.stream()
				.filter(courier -> courier.getId().equals(courierId))
				.findFirst();
		// @formatter:on
	}

}
