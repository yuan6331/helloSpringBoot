package com.gdut.application.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdut.application.domain.Admin;
import com.gdut.application.service.Impl.AdminServiceImpl;

@Controller
public class MyController {
	
	@Autowired
	AdminServiceImpl adminService;

	@RequestMapping(value= {"/","/index"})
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/loginAction")
	public String login(String username,String password,HttpServletRequest request) {
		boolean flag = adminService.checkUser(username,password);
		if(flag == true) {
			return "right";
		}else {
		return "wrong";
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
