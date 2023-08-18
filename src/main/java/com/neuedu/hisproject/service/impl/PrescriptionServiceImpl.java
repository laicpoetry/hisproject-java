

package com.neuedu.hisproject.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.hisproject.domin.Prescription;
import com.neuedu.hisproject.domin.ResultMsg;
import com.neuedu.hisproject.mapper.PrescriptionMapper;
import com.neuedu.hisproject.service.IPrescriptionService;

@Service
public class PrescriptionServiceImpl implements IPrescriptionService{

	@Autowired
	PrescriptionMapper mapper;
	
	public ResultMsg save(Prescription prescription) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 prescription.setCreationTime(sdf.format(System.currentTimeMillis()));
		int rs = 0;
		ResultMsg rm = new ResultMsg();
		rs = mapper.save(prescription);
		if(rs!=0){
			rm.setCode(1);
			rm.setMessage("开立成功");
		}else{
			rm.setCode(-1);
			rm.setMessage("开立失败");
		}
		return rm;
	}

}
