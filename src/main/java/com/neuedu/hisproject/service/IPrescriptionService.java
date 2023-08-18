package com.neuedu.hisproject.service;

import java.util.List;

import com.neuedu.hisproject.domin.Prescription;
import com.neuedu.hisproject.domin.ResultMsg;


public interface IPrescriptionService {

	ResultMsg save(Prescription prescription);

}
