package com.migros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migros.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
