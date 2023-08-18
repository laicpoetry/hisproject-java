package com.neuedu.hisproject.service;

import com.neuedu.hisproject.domin.Disease;
import com.neuedu.hisproject.domin.ResultMsg;

import java.util.List;

public interface IMedicalRecordDiseaseService {
    ResultMsg add(int[] id,Integer medicalRecordId);

    List<Disease> get(int medicalRecordId);
}
