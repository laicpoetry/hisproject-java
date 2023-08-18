package com.neuedu.hisproject.domin;

import lombok.Data;

import java.util.Date;

/**
 * @author: 曹文博
 * @date :2023/8/13 15:46
 */
@Data
public class CheckRequest {
    private Integer id;
    private Integer registerId;
    private Integer medicalTechnologyId;
    private String checkInfo;
    private String checkPosition;
    private String creationTime;
    private Integer checkEmployeeId;
    private Integer inputcheckEmployeeId;
    private String checkTime;
    private String checkResult;
    private String checkState;
    private String checkRemark;
}
