package com.neuedu.hisproject.service;

import java.util.List;

import com.neuedu.hisproject.domin.CheckRequest;
import com.neuedu.hisproject.domin.ResultMsg;

public interface ICheckRequestService {
    ResultMsg addcr(CheckRequest checkRequest);

	ResultMsg addEmpId(int empId,int registerId);

	ResultMsg addInputId(CheckRequest cr);

	CheckRequest getMsg(int registerId);
    
	
}
