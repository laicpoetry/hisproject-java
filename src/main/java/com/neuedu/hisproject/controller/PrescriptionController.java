package com.neuedu.hisproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.hisproject.domin.Prescription;
import com.neuedu.hisproject.domin.ResultMsg;
import com.neuedu.hisproject.service.IPrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

	@Autowired
	IPrescriptionService service;
	@RequestMapping("/save")
	public ResultMsg save(@RequestBody Prescription prescription){
		return service.save(prescription);
	}
}
