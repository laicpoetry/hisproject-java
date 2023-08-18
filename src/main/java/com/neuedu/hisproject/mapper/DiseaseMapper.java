package com.neuedu.hisproject.mapper;

import com.neuedu.hisproject.domin.Disease;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DiseaseMapper {

    List<Disease> getAll();
}
