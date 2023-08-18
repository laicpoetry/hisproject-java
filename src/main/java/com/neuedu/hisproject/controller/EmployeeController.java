package com.neuedu.hisproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.hisproject.domin.Employee;
import com.neuedu.hisproject.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
@Autowired
IEmployeeService service;
@GetMapping("/getDoc")
public List<Employee> getDoc(@RequestParam int deptId){
	return service.getDoc(deptId);
}
}
