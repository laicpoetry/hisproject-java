package com.neuedu.hisproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.hisproject.domin.MedicalRecord;
import com.neuedu.hisproject.domin.ResultMsg;
import com.neuedu.hisproject.mapper.MedicalRecordMapper;
import com.neuedu.hisproject.service.IMedicalRecordService;
@Service
public class MedicalRecordServiceImpl implements IMedicalRecordService {
    @Autowired
    MedicalRecordMapper mapper;

    @Override
    public ResultMsg addmr(MedicalRecord mr) {
        ResultMsg rsm = new ResultMsg();
        int rs = 0;
        rs = mapper.addmr(mr);
        if(rs==1){
            rsm.setCode(1);
            rsm.setMessage("病例保存成功");
        }else{
            rsm.setCode(-1);
            rsm.setMessage("病例保存失败");
        }
        return rsm;
    }

	@Override
	public ResultMsg qz(MedicalRecord mr) {
		int rs = 0;
		ResultMsg rm = new ResultMsg();
		rs = mapper.qz(mr);
		if(rs!=0){
			rm.setCode(1);
			rm.setMessage("提交成功");
		}else{
			rm.setCode(-1);
			rm.setMessage("提交失败");
		}
		return rm;
	}
}
