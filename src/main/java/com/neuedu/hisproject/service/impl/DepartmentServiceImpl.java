package com.neuedu.hisproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.hisproject.domin.Department;
import com.neuedu.hisproject.mapper.DepartmentMapper;
import com.neuedu.hisproject.service.IDepartmentService;

@Service
public class DepartmentServiceImpl implements IDepartmentService{
@Autowired
DepartmentMapper mapper;
	@Override
	public List<Department> getAll() {
		return mapper.getAll();
	}

}
