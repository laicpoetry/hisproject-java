package com.neuedu.hisproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.hisproject.domin.Department;
import com.neuedu.hisproject.domin.Employee;
import com.neuedu.hisproject.domin.RegistLevel;
import com.neuedu.hisproject.domin.SettleCategory;
import com.neuedu.hisproject.service.ISettleCategoryService;

@RestController
@RequestMapping("/settleCategory")
public class SettleCategoryController {

	@Autowired
	ISettleCategoryService service;
	
	@GetMapping("/findSettleCategory")
	public List<SettleCategory> findSettleCategory(){
		return service.findSettleCategory();
	}
	
	@GetMapping("/findDepartment")
	public List<Department> findDepartment(){
		return service.findDepartment();
	}
	
	@GetMapping("/findregistLevel")
	public List<RegistLevel> findregistLevel(){
		return service.findregistLevel();
	}
	
	
	@GetMapping("/findEmployee")
	public List<Employee> findEmployee(){
		return service.findEmployee();
	}
	
	@GetMapping("/findcaseNumber")
	public String findcaseNumber(){
		return service.findcaseNumber();
	}
}
