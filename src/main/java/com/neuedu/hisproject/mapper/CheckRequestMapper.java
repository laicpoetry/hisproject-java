package com.neuedu.hisproject.mapper;

import com.neuedu.hisproject.domin.CheckRequest;
import com.neuedu.hisproject.domin.ResultMsg;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface CheckRequestMapper {
    int addcr(CheckRequest checkRequest);
    @Update("update check_request set check_employee_id = #{empId},check_state = '待检查' where register_id = #{registerId}")
	int addEmpId(@Param("empId") int empId,@Param("registerId") int registerId);
	@Update("update check_request set inputcheck_employee_id = #{inputcheckEmployeeId},check_time=#{checkTime},check_result=#{checkResult} where register_id = #{registerId}")
    int addInputId(CheckRequest cr);
	
	CheckRequest getMsg(@Param("registerId")int registerId);
	
    
    
    
}
