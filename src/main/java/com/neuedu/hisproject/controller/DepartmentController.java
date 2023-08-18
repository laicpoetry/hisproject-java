package com.neuedu.hisproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.hisproject.domin.Department;
import com.neuedu.hisproject.service.IDepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	@Autowired
	IDepartmentService service;
	@RequestMapping("/getAll")
	public List<Department> getAll(){
		return service.getAll();
	}
	

}
