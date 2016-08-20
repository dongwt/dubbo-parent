package com.dongwt.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.dongwt.dubbo.service.api.ProviderService;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

	@Override
	public String sayHello(String name) {
		return "hello world " + name;
	}

}
