package com.dongwt.dubbo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dongwt.dubbo.service.api.ProviderService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:/spring/spring-mvc.xml")
public class ProviderServiceTest {
	
	@Autowired
	private ProviderService providerService ;
	
	@Test
	public void sayHello(){
		try {
			String result = providerService.sayHello("tom");
			System.out.println(result);
			Thread.sleep(1000 * 60 * 60);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
