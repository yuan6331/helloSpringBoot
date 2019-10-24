package com.gdut.application.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.gdut.application.domain.Admin;

public interface AdminService {
	
	Admin findUser(HttpServletRequest requset);
	
	String checkUser(String username,String password,HttpServletRequest request);
}
