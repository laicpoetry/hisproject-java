package com.neuedu.hisproject.service;

import java.util.List;

import com.neuedu.hisproject.domin.Employee;

public interface IEmployeeService {

	List<Employee> getDoc(int deptId);

}
