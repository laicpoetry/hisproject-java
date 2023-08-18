package com.neuedu.hisproject.domin;

import lombok.Data;

@Data
public class MedicalRecord {
	 private static final long serialVersionUID = 1L;

	    /** $column.columnComment */
	    private Long id;

	    /** 关联挂号表id */
	    private Long registerId;

	    /** 主诉 */
	    private String readme;

	    /** 现病史 */
	    private String present;

	    /** 现病治疗情况 */
	    private String presentTreat;

	    /** 既往史 */
	    private String history;

	    /** 过敏史 */
	    private String allergy;

	    /** 体格检查 */
	    private String physique;

	    /** 检查/检验建议 */
	    private String proposal;

	    /** 注意事项 */
	    private String careful;

	    /** 断诊结果 */
	    private String diagnosis;

	    /** 理处意见 */
	    private String cure;
}
