package com.neuedu.hisproject.service;

import java.util.List;

import com.neuedu.hisproject.domin.Register;
import com.neuedu.hisproject.domin.ResultMsg;


/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-08-09
 */
public interface IRegisterService 
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
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteRegisterByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteRegisterById(Long id);

	public Register selectRegisterByNumber(String caseNumber);

	public int getNumber();

	public ResultMsg changState(String caseNumber);

	public List<Register> queryJZ();

	public List<Register> getReg(String realName, String caseNumber);

	public List<Register> queryGh(Register rs);
	int saveRegister(Register register);


}
