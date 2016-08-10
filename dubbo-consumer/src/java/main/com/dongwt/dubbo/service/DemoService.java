package com.dongwt.dubbo.service;

import org.springframework.stereotype.Service;

@Service
public interface DemoService {
	public abstract String sayHello(String name);
}
