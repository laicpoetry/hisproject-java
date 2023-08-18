package com.neuedu.hisproject.service;

import java.util.List;

import com.neuedu.hisproject.domin.DurgInfo;


public interface IDurgInfoService {

	List<DurgInfo> findLike(DurgInfo durgInfo);

}
