package com.neuedu.hisproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neuedu.hisproject.domin.Register;


/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-09
 */
public interface RegisterMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Register selectRegisterById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param register 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Register> selectRegisterList(Register register);

    /**
     * 新增【请填写功能名称】
     * 
     * @param register 【请填写功能名称】
     * @return 结果
     */
    public int insertRegister(Register register);

    /**
     * 修改【请填写功能名称】
     * 
     * @param register 【请填写功能名称】
     * @return 结果
     */
    public int updateRegister(Register register);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteRegisterById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRegisterByIds(Long[] ids);
    

	public Register selectRegisterByNumber(String caseNumber);

	@Select("select count(*) from register where visit_state=1")
	public int getNumber();
	
	@Update("update register set visit_state = 2 where case_number = #{caseNumber} ")
	public int changeState(String caseNumber);
	
	public List<Register> queryJZ();

	public List<Register> getReg(@Param("realName")String realName, @Param("caseNumber")String caseNumber);
	
	public List<Register> queryGh(Register rs);
	@Insert("insert into register values(null,#{caseNumber},#{realName},#{gender},#{cardNumber},#{birthday},#{age},#{ageType},#{homeAddress},#{visitDate},#{noon},#{deptmentId},#{employeeId},#{registLevelId},#{settleCategoryId},#{isBook},#{registMethod},#{visitState},#{registMoney})")
	int saveRegister(Register register);
}
