package com.migros.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.migros.dto.request.CourierEntranceCountRequest;
import com.migros.exception.CourierTrakingException;
import com.migros.model.Courier;
import com.migros.model.CourierLog;
import com.migros.model.Point;
import com.migros.model.Store;
import com.migros.repository.CourierLogRepository;
import com.migros.repository.CourierRepository;
import com.migros.repository.StoreRepository;
import com.migros.util.DateUtil;
import com.migros.util.DistanceUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CourierService implements MyBean {

	private static CourierService courierService;

	private CourierService() {
	}

	public static synchronized CourierService getSingletonInstance() {
		if (courierService == null) {
			courierService = new CourierService();
		}
		return courierService;
	}

	@Autowired
	private CourierRepository courierRepository;

	@Autowired
	private StoreRepository storeRepository;

	@Autowired
	private CourierLogRepository courierStoreRepository;

	private static final Double STORE_DISTANCE = 100.0;

	private static final long ONE_MINUTE = 1;

	public Double getTotalTravelDistance(int courierId) {
		Courier courier = validateCourier(courierId);

		return null;
	}

	public void countEntrance(CourierEntranceCountRequest request, int courierId) {
		Courier courier = validateCourier(courierId);

		List<Store> stores = storeRepository.findAllStores();

		stores.stream().forEach(store -> checkDistance(request, courier, store));

	}

	private Courier validateCourier(int courierId) {
		Optional<Courier> foundCourier = courierRepository.findById(courierId);

		if (!foundCourier.isPresent()) {
			log.error("getTotalTravelDistance :: courier not found");
			throw new CourierTrakingException("courier not found");
		}
		return foundCourier.get();
	}

	private void checkDistance(CourierEntranceCountRequest request, Courier courier, Store store) {
		double distance = DistanceUtil.distance(store.getPoint(),
				new Point(request.getLatitude(), request.getLongitude()));

		saveCourierLog(request, courier, store, distance);
	}

	private void saveCourierLog(CourierEntranceCountRequest request, Courier courier, Store store, double distance) {
		if (STORE_DISTANCE <= distance) {
			log.info("countEntrance :: courierId:{} entraned to store name: {}", courier.getId(), store.getName());
			Sort sort = Sort.by(Sort.Direction.ASC, "date");
			CourierLog courierLog = courierStoreRepository.findOneByCourierId(courier.getId(), sort);

			long differenceMinute = DateUtil.calculateDifferenceMinutes(courierLog.getEntranceTime(),
					request.getEntranceTime());

			if (ONE_MINUTE < differenceMinute) {
				courierStoreRepository.save(new CourierLog(courier, store, LocalDateTime.now()));
				log.info("countEntrance :: courierId:{} entraned to store name: {} saved", courier.getId(),
						store.getName());
			}
		}
	}

}
