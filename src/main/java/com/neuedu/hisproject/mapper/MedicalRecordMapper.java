package com.neuedu.hisproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import com.neuedu.hisproject.domin.MedicalRecord;

public interface MedicalRecordMapper {
	  /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public MedicalRecord selectMedicalRecordById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param medicalRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MedicalRecord> selectMedicalRecordList(MedicalRecord medicalRecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param medicalRecord 【请填写功能名称】
     * @return 结果
     */
    public int insertMedicalRecord(MedicalRecord medicalRecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param medicalRecord 【请填写功能名称】
     * @return 结果
     */
    public int updateMedicalRecord(MedicalRecord medicalRecord);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMedicalRecordById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMedicalRecordByIds(Long[] ids);
    
    @Insert("insert into medical_record(id,register_id,readme,present,present_treat,history,allergy,physique,proposal,careful) " +
            " values(null,#{registerId},#{readme},#{presentTreat},#{history},#{allergy},#{physique}," +
            " #{proposal},#{careful},#{present})")
    int addmr(MedicalRecord mr);
    @Update("update medical_record set diagnosis=#{diagnosis},cure=#{cure} where register_id = #{registerId}")
	public int qz(MedicalRecord mr);
}
