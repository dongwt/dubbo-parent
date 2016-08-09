package com.dongwt.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.dongwt.dubbo.service.DemoService;

@Service(value="demoService")
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "hello " + name;
	}

}
