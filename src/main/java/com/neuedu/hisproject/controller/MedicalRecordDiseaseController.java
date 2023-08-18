package com.neuedu.hisproject.controller;

import com.neuedu.hisproject.domin.Disease;
import com.neuedu.hisproject.domin.ResultMsg;
import com.neuedu.hisproject.service.IMedicalRecordDiseaseService;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 曹文博
 * @date :2023/8/12 21:31
 */
@RestController
@RequestMapping("/mrd")
public class MedicalRecordDiseaseController {
    @Autowired
    IMedicalRecordDiseaseService service;

    @GetMapping ("/add")
    public ResultMsg add(@RequestParam int[] id, Integer medicalRecordId){
     
        return service.add(id,medicalRecordId);
    }
  @GetMapping("/get")
  public List<Disease> get(@RequestParam int medicalRecordId){
      System.out.println(medicalRecordId);
      return service.get(medicalRecordId);

  }

}
