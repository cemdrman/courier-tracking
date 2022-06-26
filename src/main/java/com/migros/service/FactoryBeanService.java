package com.migros.service;

import com.migros.enums.ServiceEnum;

public class FactoryBeanService {

	private FactoryBeanService() {

	}

	public static MyBean getBean(ServiceEnum serviceName) {

		if (ServiceEnum.COURIER_SERVICE.getServiceName().equalsIgnoreCase(serviceName.getServiceName())) {
			return CourierService.getSingletonInstance();
		}
		return null;
	}

}
