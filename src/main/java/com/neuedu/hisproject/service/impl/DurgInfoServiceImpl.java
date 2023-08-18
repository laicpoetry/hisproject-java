package com.neuedu.hisproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.hisproject.domin.DurgInfo;
import com.neuedu.hisproject.mapper.DurgInfoMapper;
import com.neuedu.hisproject.service.IDurgInfoService;
@Service
public class DurgInfoServiceImpl implements IDurgInfoService {

	@Autowired
	DurgInfoMapper mapper;
	
	public List<DurgInfo> findLike(DurgInfo durgInfo) {
		// TODO Auto-generated method stub
		return mapper.findLike(durgInfo);
	}

}
