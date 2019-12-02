package com.gdut.application.handler;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gdut.application.domain.Admin;
import com.gdut.application.service.Impl.AdminServiceImpl;

@Controller
public class MyController {

	@Autowired
	AdminServiceImpl adminService;

	@RequestMapping(value = { "/", "/index" })
	public String index(Model model) {
		model.addAttribute("user", new Admin());
		return "index";
	}

	@ResponseBody
	@GetMapping("/loginAction")
	public String login(@Param(value="username") String username, @Param(value="password") String password,	HttpServletRequest request) {
		System.out.println("controller");
		return adminService.checkUser(username, password, request);
	}

	@RequestMapping("/success")
	public String loginSucccess() {
		return "success";
	}

	@RequestMapping("/user")
	public String showUser(HttpServletRequest request, String userName) {
		request.setAttribute("user", adminService.findUser(request));
		return "login";
	}

}
