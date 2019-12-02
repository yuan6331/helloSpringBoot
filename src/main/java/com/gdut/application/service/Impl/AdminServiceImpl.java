package com.gdut.application.service.Impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdut.application.domain.Admin;
import com.gdut.application.mapper.AdminMapper;
import com.gdut.application.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper adminMapper;

	@Override
	public Admin findUser(HttpServletRequest requset) {
		return adminMapper.findUser();
	}

	@Override
	public String checkUser(String username, String password, HttpServletRequest request) {
		Admin user = adminMapper.checkUser(username);
		System.out.println("impl");
		if (username.equals(null) || "".equals(username) || password.equals(null) || "".equals(password)) {
			return "none";
		}else if(user==null) {
			return "wrong username";
		}
		if (username.equals(user.getusername()) && password.equals(user.getPassword())) {
			request.setAttribute("user", user);
			return "right";
		}
		return "wrong account";
	}

}
