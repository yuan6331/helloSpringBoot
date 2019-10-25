package com.gdut.application.service.Impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdut.application.domain.Admin;
import com.gdut.application.mapper.AdminMapper;
import com.gdut.application.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminMapper adminMapper;
	
	@Override
	public Admin findUser(HttpServletRequest requset) {
		return adminMapper.findUser();
	}

	@Override
	public String checkUser(String username,String password,HttpServletRequest request) {
		Admin user=adminMapper.checkUser(username);
		System.out.println("username: "+user.getusername());
		System.out.println("password: "+user.getPassword());
		request.setAttribute("user",user);
		System.out.println("service: "+username);
		System.out.println("service: "+password);
		if(username!=null&&password!=null) {
			if(user.getusername()==username&&user.getPassword()==password) {
				return "right";
			}else{
				return "wrong";
			}
		}
		 return "empty";
	}

}
