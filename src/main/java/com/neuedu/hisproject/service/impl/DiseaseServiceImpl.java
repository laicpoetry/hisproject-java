package com.neuedu.hisproject.service.impl;

import com.neuedu.hisproject.mapper.DiseaseMapper;
import com.neuedu.hisproject.domin.Disease;
import com.neuedu.hisproject.service.IDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 曹文博
 * @date :2023/8/12 17:34
 */
@Service
public class DiseaseServiceImpl implements IDiseaseService {
    @Autowired
    DiseaseMapper mapper;
    @Override
    public List<Disease> getAll() {
        return mapper.getAll();
    }
}
