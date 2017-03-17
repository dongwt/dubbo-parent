package com.dongwt.dubbo.service.impl;

import com.dongwt.dubbo.api.req.User;
import com.dongwt.dubbo.api.resp.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongwt.dubbo.service.ConsumerService;
import com.dongwt.dubbo.service.ProviderService;

@Service("consumerService")
public class ConsumerServiceImpl implements ConsumerService {
	
	@Autowired
	private ProviderService providerService;

	@Override
	public String executeMethod(String name) {
		return providerService.sayHello(name);
	}

	@Override
	public Response<User> register(User user) {
		Response<User> result = providerService.register(user);
		return result;
	}

}
