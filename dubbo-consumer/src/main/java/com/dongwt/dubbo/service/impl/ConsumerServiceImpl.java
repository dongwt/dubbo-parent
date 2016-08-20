package com.dongwt.dubbo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongwt.dubbo.service.ConsumerService;
import com.dongwt.dubbo.service.api.ProviderService;

@Service("consumerService")
public class ConsumerServiceImpl implements ConsumerService {
	
	@Autowired
	private ProviderService ProviderService;

	@Override
	public String executeMethod(String name) {
		return ProviderService.sayHello(name);
	}

}
