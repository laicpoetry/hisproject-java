package com.neuedu.hisproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.hisproject.domin.Employee;
import com.neuedu.hisproject.mapper.EmployeeMapper;
import com.neuedu.hisproject.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService{
@Autowired
EmployeeMapper mapper;
	@Override
	public List<Employee> getDoc(int deptId) {
		return mapper.getDoc(deptId);
	}
	

}
