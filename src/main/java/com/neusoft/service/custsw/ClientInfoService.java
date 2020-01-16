package com.neusoft.service.custsw;

import java.util.List;

import com.neusoft.entity.ClientInfo;

public interface ClientInfoService {
	// 编辑客户信息,客户经理可以编辑状态为“正常”的客户信息
	public int updateClientInfo(ClientInfo clientInfo);
	// 查询全部客户信息
	public List<ClientInfo> selectClientInfoAll();
	// 查询六个月没有下订单的客户信息
	public List<ClientInfo> selectClientInofByOrdersDate();
	
	//添加客户信息
	public int insertClientInfo(ClientInfo clientInfo);
}
