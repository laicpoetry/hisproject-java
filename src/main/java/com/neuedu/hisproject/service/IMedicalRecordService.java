package com.neuedu.hisproject.service;

import com.neuedu.hisproject.domin.MedicalRecord;
import com.neuedu.hisproject.domin.ResultMsg;

public interface IMedicalRecordService {

	ResultMsg addmr(MedicalRecord mr);

	ResultMsg qz(MedicalRecord mr);

}
