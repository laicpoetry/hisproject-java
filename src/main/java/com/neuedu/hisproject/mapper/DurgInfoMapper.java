package com.neuedu.hisproject.mapper;

import java.util.List;

import com.neuedu.hisproject.domin.DurgInfo;


public interface DurgInfoMapper {

	List<DurgInfo> findLike(DurgInfo durgInfo);

}
