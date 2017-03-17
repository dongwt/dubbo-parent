package com.dongwt.dubbo.service;

import com.dongwt.dubbo.api.req.User;
import com.dongwt.dubbo.api.resp.Response;

public interface ProviderService {

	String sayHello(String name);

	Response<User> register(User user);
}
