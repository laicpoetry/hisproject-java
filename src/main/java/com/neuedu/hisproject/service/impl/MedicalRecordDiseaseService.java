package com.neuedu.hisproject.service.impl;

import com.neuedu.hisproject.domin.Disease;
import com.neuedu.hisproject.domin.ResultMsg;
import com.neuedu.hisproject.mapper.MedicalRecordDiseaseMapper;

import com.neuedu.hisproject.service.IMedicalRecordDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 曹文博
 * @date :2023/8/12 21:38
 */
@Service
public class MedicalRecordDiseaseService implements IMedicalRecordDiseaseService {
    @Autowired
    MedicalRecordDiseaseMapper mapper;

    @Override
    public ResultMsg add(int[] id,Integer medicalRecordId) {
        int rs = 0;
        for (int i = 0; i < id.length; i++) {
            rs = mapper.add(id[i],medicalRecordId);
        }
       ResultMsg resultMsg = new ResultMsg();
        if(rs>0){
            resultMsg.setCode(1);
            resultMsg.setMessage("添加成功");
        }else{
            resultMsg.setCode(-1);
            resultMsg.setMessage("添加失败");
        }
    return resultMsg;
    }

    @Override
    public List<Disease> get(int medicalRecordId) {
        return mapper.get(medicalRecordId);
    }
}
