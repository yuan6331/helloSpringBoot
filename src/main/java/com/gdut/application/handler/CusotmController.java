package com.gdut.application.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gdut.application.domain.Custom;
import com.gdut.application.service.Impl.CustomServiceImpl;

@Controller
public class CusotmController {
	
	@Autowired
	CustomServiceImpl customService;
	
	@RequestMapping("/regist")
	public String regist(Custom c) {
		c = new Custom(1,123456,"yuan","zhangsan");
		System.out.println(c.toString());
		customService.SaveCustom(c);
		return "customList";
	}
	
	@RequestMapping("/querry")
	public List<Custom> querryAll(){
		List<Custom> cList = customService.getCustoms();
		for(Custom c : cList) {
			System.out.println(c.toString());
		}
		return cList;
	}

}
