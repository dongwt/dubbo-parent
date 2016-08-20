package com.dongwt.dubbo.test;

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
	};

}
