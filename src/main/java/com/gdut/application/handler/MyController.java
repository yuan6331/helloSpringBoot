package com.gdut.application.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gdut.application.service.Impl.AdminServiceImpl;

@Controller
public class MyController {
	
	@Autowired
	AdminServiceImpl adminService;

	@RequestMapping(value= {"/","/index"})
	public String index() {
		
		return "index";
	}
	@ResponseBody
	@GetMapping("/loginAction")
	public String login(String username,String password,HttpServletRequest request) {
		String flag = adminService.checkUser(username,password, request);
		System.out.println(username);
		if(flag == "right") {
			return "index";
		}else {
		return "login";
		}
	}
	
	@RequestMapping("/success")
	public String loginSucccess() {
		return "login";
	}
	
	@RequestMapping("/user")
	public String showUser(HttpServletRequest request,String userName) {
		request.setAttribute("user",adminService.findUser(request));
		 return "success";
	}
	
}
