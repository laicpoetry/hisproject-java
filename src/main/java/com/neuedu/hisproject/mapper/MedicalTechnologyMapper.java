package com.neuedu.hisproject.mapper;

import com.neuedu.hisproject.domin.MedicalTechnology;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MedicalTechnologyMapper {
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public MedicalTechnology selectMedicalTechnologyById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param medicalTechnology 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MedicalTechnology> selectMedicalTechnologyList(MedicalTechnology medicalTechnology);

    /**
     * 新增【请填写功能名称】
     *
     * @param medicalTechnology 【请填写功能名称】
     * @return 结果
     */
    public int insertMedicalTechnology(MedicalTechnology medicalTechnology);

    /**
     * 修改【请填写功能名称】
     *
     * @param medicalTechnology 【请填写功能名称】
     * @return 结果
     */
    public int updateMedicalTechnology(MedicalTechnology medicalTechnology);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMedicalTechnologyById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMedicalTechnologyByIds(Long[] ids);

	public List<MedicalTechnology> getmt(int registerId);
}
