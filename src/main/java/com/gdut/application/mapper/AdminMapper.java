package com.gdut.application.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.gdut.application.domain.Admin;

@Mapper
public interface AdminMapper {
	
	@Select("select * from admin")
	Admin findUser();
	
	@Select("select * from admin where username = #{username}")
	Admin checkUser(String username);
	
	int insertUser(String userName,String password);
	
	void deleteUser(String userName);
}
