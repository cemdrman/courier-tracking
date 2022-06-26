package com.migros.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.migros.model.CourierLog;

public interface CourierLogRepository extends MongoRepository<CourierLog, String> {

	CourierLog findOneByCourierId(Integer id, Sort sort);

}
