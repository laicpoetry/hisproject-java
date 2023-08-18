package com.neuedu.hisproject.service.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.hisproject.domin.Register;
import com.neuedu.hisproject.domin.ResultMsg;
import com.neuedu.hisproject.mapper.RegisterMapper;
import com.neuedu.hisproject.service.IRegisterService;




@Service
public class RegisterServiceImpl implements IRegisterService 
{
    @Autowired
    private RegisterMapper registerMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Register selectRegisterById(Long id)
    {
        return registerMapper.selectRegisterById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param register 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Register> selectRegisterList(Register register)
    {
    	register.setVisitState(1);
        return registerMapper.selectRegisterList(register);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param register 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRegister(Register register)
    {
        return registerMapper.insertRegister(register);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param register 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRegister(Register register)
    {
        return registerMapper.updateRegister(register);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRegisterByIds(Long[] ids)
    {
        return registerMapper.deleteRegisterByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRegisterById(Long id)
    {
        return registerMapper.deleteRegisterById(id);
    }

	@Override
	public Register selectRegisterByNumber(String caseNumber) {
		System.out.println(caseNumber);
		return registerMapper.selectRegisterByNumber(caseNumber);
	}

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return registerMapper.getNumber();
	}

	@Override
	public ResultMsg changState(String caseNumber) {
		int rs = 0;
		ResultMsg rm = new ResultMsg();
		rs = registerMapper.changeState(caseNumber);
		if(rs!=0){
			rm.setCode(1);
		}else{
			rm.setCode(-1);
		}
		return null;
	}

	@Override
	public List<Register> queryJZ() {
		return registerMapper.queryJZ();
	}

	@Override
	public List<Register> getReg(String realName, String caseNumber) {
		return registerMapper.getReg(realName,caseNumber);
	}

	@Override
	public List<Register> queryGh(Register rs) {
		
		return registerMapper.queryGh(rs);
		
	}
	
	public int saveRegister(Register register) {
		register.setVisitState(1);
		return registerMapper.saveRegister(register);
	}

}

