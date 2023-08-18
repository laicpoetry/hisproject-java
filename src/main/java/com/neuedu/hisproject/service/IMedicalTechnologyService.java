package com.neuedu.hisproject.service;

import com.neuedu.hisproject.domin.CheckRequest;
import com.neuedu.hisproject.domin.MedicalTechnology;

import java.util.List;

public interface IMedicalTechnologyService {
    List<MedicalTechnology> getAll(MedicalTechnology medicalTechnology);

	List<MedicalTechnology> getmt(int registerId);
}
