package com.migros.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.migros.model.Point;
import com.migros.model.Store;

public class StoreRepository {

	private static List<Store> storeList = new ArrayList<>();

	static {
		storeList.add(new Store("Ataşehir MMM Migros", new Point(40.9923307, 29.1244229)));
		storeList.add(new Store("Novada MMM Migros", new Point(40.986106, 29.1161293)));
		storeList.add(new Store("Beylikdüzü 5M Migros", new Point(41.0066851, 28.6552262)));
		storeList.add(new Store("Ortaköy MMM Migros", new Point(41.055783, 29.0210292)));
		storeList.add(new Store("Caddebostan MMM Migros", new Point(40.9632463, 29.0630908)));
	}

	public List<Store> findAllStores() {
		return storeList;
	}

	public Optional<Store> findByName(String name) {
		//// @formatter:off
		return storeList.stream()
				.filter(store -> store.getName().equals(name))
				.findFirst();
		// @formatter:on
	}

}
