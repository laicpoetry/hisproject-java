package com.neuedu.hisproject.controller;

import com.neuedu.hisproject.domin.CheckRequest;
import com.neuedu.hisproject.domin.ResultMsg;
import com.neuedu.hisproject.service.ICheckRequestService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 曹文博
 * @date :2023/8/13 15:50
 */
@RestController
@RequestMapping("/cr")
public class CheckRequestController {
    @Autowired
    ICheckRequestService service;
    @PostMapping("/addcr")
    public ResultMsg addcr(@RequestBody CheckRequest checkRequest){
        return service.addcr(checkRequest);
    }
   @GetMapping("/addEmpId")
   public ResultMsg addEmpId(@RequestParam int empId,int registerId){
	 
	   return service.addEmpId(empId, registerId);
   }
   @PostMapping("/addInputId")
   public ResultMsg addInputId(@RequestBody CheckRequest cr){
	  System.out.println(cr);
	   return service.addInputId(cr);
   }
   @GetMapping("/getMsg")
   public CheckRequest getMsg(@RequestParam int registerId){
	  System.out.println(registerId);
	   return service.getMsg(registerId);
   }
   
}
