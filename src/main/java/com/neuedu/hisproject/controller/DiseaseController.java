package com.neuedu.hisproject.controller;

import com.neuedu.hisproject.domin.Disease;
import com.neuedu.hisproject.service.IDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 曹文博
 * @date :2023/8/12 17:30
 */
@RestController
@RequestMapping("/disease")
public class DiseaseController {
    @Autowired
    IDiseaseService service;
    @PostMapping("/getAll")
    public List<Disease> getAll(){
    	
        return service.getAll();
    }
}
