package com.migros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migros.model.Courier;

public interface CourierRepository extends JpaRepository<Courier, Integer> {

}
