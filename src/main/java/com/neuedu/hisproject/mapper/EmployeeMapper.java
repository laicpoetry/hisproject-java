package com.neuedu.hisproject.mapper;

import java.util.List;

import com.neuedu.hisproject.domin.Employee;

public interface EmployeeMapper {

	List<Employee> getDoc(int deptId);

}
