package com.neuedu.hisproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.hisproject.domin.MedicalRecord;
import com.neuedu.hisproject.domin.ResultMsg;
import com.neuedu.hisproject.service.IMedicalRecordService;

@RestController
@RequestMapping("/mr")
public class MedicalRecordController {
	 @Autowired
	    IMedicalRecordService service;
	    @PostMapping("/addmr")
	    public ResultMsg addmr(@RequestBody MedicalRecord mr){
	        return service.addmr(mr);
	    }
	    @PostMapping("/qz")
	    public ResultMsg qz(@RequestBody MedicalRecord mr){
	    	return service.qz(mr);
	    }
}
