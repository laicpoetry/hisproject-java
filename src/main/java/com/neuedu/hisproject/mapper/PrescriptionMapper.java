package com.neuedu.hisproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.hisproject.domin.Prescription;


public interface PrescriptionMapper {

	int save(Prescription prescription);

}
