package com.neuedu.hisproject.domin;

import lombok.Data;

/**
 * @author: 曹文博
 * @date :2023/8/12 17:32
 */
@Data
public class Disease {
    private Integer id;
    private String diseaseCode;
    private String diseaseName;
    private String diseaseICD;
    private String diseaseCategory;
}
