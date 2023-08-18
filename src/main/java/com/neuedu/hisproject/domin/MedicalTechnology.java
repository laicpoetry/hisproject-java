package com.neuedu.hisproject.domin;

import lombok.Data;

/**
 * @author: 曹文博
 * @date :2023/8/13 0:39
 */
@Data
public class MedicalTechnology {
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 项目编码 */

    private String techCode;

    /** 项目名称 */

    private String techName;

    /** 规格 */

    private String techFormat;

    /** $column.columnComment */

    private String techPrice;

    /** $column.columnComment */

    private String techType;

    /** $column.columnComment */

    private String priceType;

    /** $column.columnComment */

    private Long deptmentId;
}
