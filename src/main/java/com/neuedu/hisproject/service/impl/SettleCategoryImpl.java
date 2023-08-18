package com.neuedu.hisproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.hisproject.domin.Department;
import com.neuedu.hisproject.domin.Employee;
import com.neuedu.hisproject.domin.RegistLevel;
import com.neuedu.hisproject.domin.SettleCategory;
import com.neuedu.hisproject.mapper.SettleCategoryMapper;
import com.neuedu.hisproject.service.ISettleCategoryService;
@Service
public class SettleCategoryImpl implements ISettleCategoryService {

	@Autowired
	SettleCategoryMapper mapper;
	@Override
	public List<SettleCategory> findSettleCategory() {
		
		return mapper.findSettleCategory();
	}
	@Override
	public List<Department> findDepartment() {
		
		return mapper.findDepartment();
	}
	@Override
	public List<RegistLevel> findregistLevel() {
		
		return mapper.findregistLevel();
	}
	@Override
	public List<Employee> findEmployee() {
		
		return mapper.findEmployee();
	}
	@Override
	public String findcaseNumber() {
		String caseNumber = mapper.findcaseNumber();
		String newCaseNumber =null;
		if(caseNumber!=null){
			int sum = Integer.parseInt(caseNumber)+1;
			newCaseNumber = String.valueOf(sum);
		}else{
			newCaseNumber = "1000001";
		}
		return newCaseNumber;
	}

}
