package com.neuedu.hisproject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.hisproject.domin.Register;
import com.neuedu.hisproject.domin.ResultMsg;
import com.neuedu.hisproject.service.IRegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	IRegisterService service;
	@PostMapping("/queryOne")
	public Register getRegister(Register reg){
		String caseNumber = reg.getCaseNumber();
		return service.selectRegisterByNumber(caseNumber);
	}
	
	@PostMapping("/queryAll")
	public List<Register> getAllRegister(@RequestBody Register register){
		System.out.println(register);
		return service.selectRegisterList(register);
	}
	@PostMapping("/getNumber")
	public int getNumber(){
		return service.getNumber();
	}
	@GetMapping("/changeState")
	public ResultMsg changeState(String caseNumber){
		System.out.println(caseNumber);
		return service.changState(caseNumber);
	}
	@PostMapping("/queryJZ")
	public List<Register> queryJZ(){
		return service.queryJZ();
	}
	@GetMapping("/getReg")
	public List<Register> getReg(@RequestParam String realName,String caseNumber){
		System.out.println(realName);
		System.out.println(caseNumber);
		return service.getReg(realName,caseNumber);
	}
	@PostMapping("/queryGh")
	public List<Register> queryGh(@RequestBody Register rs){
		return service.queryGh(rs);
	}
	@PostMapping("/saveRegister")
	public int saveRegister(@RequestBody Register register){
		return service.saveRegister(register);
	}
}
