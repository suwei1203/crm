package com.neusoft.service.custsw.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.ClientInfo;
import com.neusoft.mapper.custsw.ClientInfoMapper;
import com.neusoft.service.custsw.ClientInfoService;

@Service
public class ClientInfoServiceImpl implements ClientInfoService {
	@Autowired
	ClientInfoMapper clientInfoMapper;
	// 编辑客户信息,客户经理可以编辑状态为“正常”的客户信息
	@Override
	public int updateClientInfo(ClientInfo clientInfo) {
		return clientInfoMapper.updateClientInfo(clientInfo);
	}
	// 查询全部客户信息
	@Override
	public List<ClientInfo> selectClientInfoAll() {
		return clientInfoMapper.selectClientInfoAll();
	}
	// 查询六个月没有下订单的客户信息
	@Override
	public List<ClientInfo> selectClientInofByOrdersDate() {
		return clientInfoMapper.selectClientInofByOrdersDate();
	}
	
	//添加客户信息
	@Override
	public int insertClientInfo(ClientInfo clientInfo) {
		return clientInfoMapper.insertClientInfo(clientInfo);
	}


}
