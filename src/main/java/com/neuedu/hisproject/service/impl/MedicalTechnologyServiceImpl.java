package com.neuedu.hisproject.service.impl;

import com.neuedu.hisproject.mapper.MedicalTechnologyMapper;
import com.neuedu.hisproject.domin.CheckRequest;
import com.neuedu.hisproject.domin.MedicalTechnology;
import com.neuedu.hisproject.service.IMedicalTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 曹文博
 * @date :2023/8/13 0:45
 */
@Service
public class MedicalTechnologyServiceImpl implements IMedicalTechnologyService {
@Autowired
    MedicalTechnologyMapper mapper;
    @Override
    public List<MedicalTechnology> getAll(MedicalTechnology medicalTechnology) {
        return mapper.selectMedicalTechnologyList(medicalTechnology);
    }
	@Override
	public List<MedicalTechnology> getmt(int registerId) {
		return mapper.getmt(registerId);
	}
}
