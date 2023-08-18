package com.neuedu.hisproject.mapper;

import java.util.List;

import com.neuedu.hisproject.domin.Department;
import com.neuedu.hisproject.domin.Employee;
import com.neuedu.hisproject.domin.RegistLevel;
import com.neuedu.hisproject.domin.SettleCategory;



public interface SettleCategoryMapper {

List<SettleCategory> findSettleCategory();

List<Department> findDepartment();

List<RegistLevel> findregistLevel();

List<Employee> findEmployee();

String findcaseNumber();

}
