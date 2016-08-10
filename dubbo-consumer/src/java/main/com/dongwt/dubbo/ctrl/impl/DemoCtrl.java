package com.dongwt.dubbo.ctrl.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dongwt.dubbo.ctrl.BaseCtrl;
import com.dongwt.dubbo.service.DemoService;

@Controller
@RequestMapping("/")
public class DemoCtrl implements BaseCtrl {

	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/test")
	@ResponseBody
	public Map<Object,Object> test(){
		Map<Object,Object> result = new HashMap<Object,Object>();
		result.put("name", demoService.sayHello("tom"));
		return result;
	}
}
