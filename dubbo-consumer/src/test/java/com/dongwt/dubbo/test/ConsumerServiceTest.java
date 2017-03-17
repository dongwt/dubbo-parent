package com.dongwt.dubbo.test;

import com.dongwt.dubbo.api.req.User;
import com.dongwt.dubbo.enums.SexEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dongwt.dubbo.service.ConsumerService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:/spring/spring-mvc.xml")
public class ConsumerServiceTest {
	
	@Autowired
	private ConsumerService consumerService;
	
	@Test
	public void executeMethod(){
		String result = consumerService.executeMethod("tom");
		System.out.println(result);
	}

	@Test
	public  void register(){
		User user = new User();
		user.setName("tom");
		user.setAge(18);
		user.setSex(SexEnum.MAN);
		consumerService.register(user);

		try {
			Thread.sleep(1000 * 60 * 60);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
