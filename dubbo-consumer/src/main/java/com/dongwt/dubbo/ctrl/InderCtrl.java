package com.dongwt.dubbo.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dongwt.dubbo.api.resp.Response;
import com.dongwt.dubbo.service.ConsumerService;

@Controller
@RequestMapping("/")
public class InderCtrl {
	
	@Autowired
	private ConsumerService consumerService;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	@ResponseBody
	public Response<String> index(@RequestParam(value="name",required=false) String name){
		Response<String> response = new Response<String>();
		response.setData(consumerService.executeMethod(name));
		response.setMessage("success");
		response.setStatus(1);
		return response;
	}
	

}
