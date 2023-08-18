package com.neuedu.hisproject.domin;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * 【请填写功能名称】对象 register
 * 
 * @author ruoyi
 * @date 2023-08-09
 */
@Data
public class Register 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 病历号 */
   
    private String caseNumber;

    /** 姓名 */
  
    private String realName;

    /** 性别（男、女） */
   
    private String gender;

    /** 身份证号 */
  
    private String cardNumber;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
 
    private Date birthday;

    /** 年龄 */
   
    private Long age;

    /** 年龄类型（年、天） */
  
    private String ageType;

    /** 家庭住址 */
   
    private String homeAddress;

    /** 本次看诊日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date visitDate;

    /** 午别（上午、下午） */
    private String noon;

    /** 本次挂号科室id */
    private Long deptmentId;

    /** 本次挂号医生id */
    private Long employeeId;

    /** 本次挂号级别id */
    private Long registLevelId;

    /** 结算类别id */
    private Long settleCategoryId;

    /** 病历本要否（要、否） */
    private String isBook;

    /** 收费方式（现金、银行卡、微信、医保卡、支付宝） */
    private String registMethod;

    /** 本次看诊状态（1-已挂号
2-医生接诊
3-看诊结束
4-已退号） */

    private Integer visitState;

    /** 挂号金额 */
    private BigDecimal registMoney;

  
}