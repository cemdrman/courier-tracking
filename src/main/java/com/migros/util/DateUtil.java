package com.migros.util;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateUtil {

	private DateUtil() {

	}

	public static long calculateDifferenceMinutes(LocalDateTime entranceTime, LocalDateTime requestTime) {
		return Duration.between(entranceTime, requestTime).toMinutes();
	}

}
