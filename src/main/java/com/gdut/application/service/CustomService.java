package com.gdut.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gdut.application.domain.Custom;


@Service
public interface CustomService {
	
	List<Custom> getCustoms();
	
	void SaveCustom(Custom c);
	
	void DeleteCustom(int id);
	
	
}
