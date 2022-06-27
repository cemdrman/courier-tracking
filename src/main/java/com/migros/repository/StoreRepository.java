package com.migros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migros.model.Store;

public interface StoreRepository extends JpaRepository<Store, Integer> {

}
