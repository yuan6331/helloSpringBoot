package com.gdut.application.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gdut.application.domain.Custom;
import com.gdut.application.repository.CustomRepository;
import com.gdut.application.service.CustomService;

public class CustomServiceImpl implements CustomService {

	@Autowired
	CustomRepository customRepository;

	@Override
	public List<Custom> getCustoms() {
		List<Custom> custmList = customRepository.findAll();
		return custmList;
	}

	@Override
	public void SaveCustom(Custom c) {
		customRepository.save(c);
	}

	@Override
	public void DeleteCustom(int id) {
		customRepository.deleteById(id);
	}

}
