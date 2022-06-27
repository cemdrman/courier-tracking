package com.migros.util;

import com.migros.model.Point;

public class DistanceUtil {

	private DistanceUtil() {

	}

	public static double calculateDistance(Point point1, Point point2) {

		final int R = 6371; // Radius of the earth

		double latDistance = Math.toRadians(point2.getLatitude() - point1.getLatitude());
		double lonDistance = Math.toRadians(point2.getLongitude() - point1.getLongitude());
		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
				+ Math.cos(Math.toRadians(point1.getLatitude())) * Math.cos(Math.toRadians(point2.getLatitude()))
						* Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		return R * c * 1000; // convert to meters
	}

}
