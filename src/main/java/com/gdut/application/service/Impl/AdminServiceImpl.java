package com.gdut.application.service.Impl;

import javax.servlet.http.HttpServletRequest;

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
		request.setAttribute("user",user);
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
