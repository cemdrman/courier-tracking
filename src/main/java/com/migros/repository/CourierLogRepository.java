package com.migros.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.migros.model.CourierLog;

public interface CourierLogRepository extends JpaRepository<CourierLog, Integer> {

	CourierLog findOneByCourierId(Integer id, Sort sort);

}
