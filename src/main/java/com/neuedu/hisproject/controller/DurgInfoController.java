package com.neuedu.hisproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.hisproject.domin.DurgInfo;
import com.neuedu.hisproject.service.IDurgInfoService;

@RestController
@RequestMapping("/DurgInfo")
public class DurgInfoController {
	
	@Autowired
	IDurgInfoService service;
	@PostMapping("/findLike")
	public List<DurgInfo> findLike(@RequestBody DurgInfo durgInfo){
		return service.findLike(durgInfo);
		
	}
} 
