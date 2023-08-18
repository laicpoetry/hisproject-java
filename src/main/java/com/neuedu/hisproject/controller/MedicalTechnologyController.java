package com.neuedu.hisproject.controller;

import com.neuedu.hisproject.domin.CheckRequest;
import com.neuedu.hisproject.domin.MedicalTechnology;
import com.neuedu.hisproject.service.IMedicalTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 曹文博
 * @date :2023/8/13 0:41
 */
@RestController
@RequestMapping("/mtc")
public class MedicalTechnologyController {
    @Autowired
    IMedicalTechnologyService service;
    @PostMapping("/getAll")
    public List<MedicalTechnology> getAll(@RequestBody MedicalTechnology medicalTechnology){
        return service.getAll(medicalTechnology);
    }
    @GetMapping("/getmt")
    public List<MedicalTechnology> getcr(@RequestParam int registerId){
    	System.out.println(registerId);
    	return service.getmt(registerId);
    }


}
