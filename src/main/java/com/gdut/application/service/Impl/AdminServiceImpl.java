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
	public boolean checkUser(String username,String password) {
		Admin user=adminMapper.findUser();
		if(username!=null&&password!=null) {
			if(user.getusername()==username&&user.getPassword()==password) {
				return true;
			}else{
				return false;
			}
		}
		 return true;
	}

}
