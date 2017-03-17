package com.dongwt.dubbo.service.impl;

import com.dongwt.dubbo.api.req.User;
import com.dongwt.dubbo.api.resp.Response;
import com.dongwt.dubbo.service.ProviderService;
import org.springframework.stereotype.Service;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

	@Override
	public String sayHello(String name) {
		return "hello world " + name;
	}

	@Override
	public Response<User>  register(User user) {
		Response<User> response = new Response<>();
		response.setData(user);
		response.setStatus(1);
		response.setMessage("成功");
		System.out.println("register");
		return response;
	}

}
