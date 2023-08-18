package com.neuedu.hisproject.service.impl;

import com.neuedu.hisproject.domin.CheckRequest;
import com.neuedu.hisproject.domin.ResultMsg;
import com.neuedu.hisproject.mapper.CheckRequestMapper;

import com.neuedu.hisproject.service.ICheckRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author: 曹文博
 * @date :2023/8/13 15:52
 */
@Service
public class CheckRequestServiceImpl implements ICheckRequestService {
    @Autowired
    CheckRequestMapper mapper;


    @Override
    public ResultMsg addcr(CheckRequest checkRequest) {
        ResultMsg resultMsg = new ResultMsg();
        int rs = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        checkRequest.setCreationTime(simpleDateFormat.format(System.currentTimeMillis()));
        rs = mapper.addcr(checkRequest);
        if(rs!=0){
            resultMsg.setCode(1);
            resultMsg.setMessage("检查申请保存成功");
        }else{
            resultMsg.setCode(-1);
            resultMsg.setMessage("检查申请保存失败");
        }
        return resultMsg;
    }


	@Override
	public ResultMsg addEmpId(int empId,int registerId) {
		ResultMsg res = new ResultMsg();
		int rs = mapper.addEmpId(empId,registerId);
		if(rs!=0){
			res.setCode(1);
			res.setMessage("请求成功");
			}else{
				res.setCode(-1);
				res.setMessage("请求出错");
			}
		return res;
	}


	@Override
	public ResultMsg addInputId(CheckRequest cr) {
		ResultMsg res = new ResultMsg();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(new Date());
		cr.setCheckTime(date);
		int rs = mapper.addInputId( cr);
		if(rs!=0){
			res.setCode(1);
			res.setMessage("请求成功");
			}else{
				res.setCode(-1);
				res.setMessage("请求出错");
			}
		return res;
	}


	@Override
	public CheckRequest getMsg(int registerId) {
		return mapper.getMsg(registerId);
	}



}
