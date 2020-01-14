package com.neusoft.service.salesw.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.ClientInfo;
import com.neusoft.mapper.salesw.ClientInfoMapper;
import com.neusoft.service.salesw.ClientInfoService;

@Service
public class ClientInfoServiceImpl implements ClientInfoService {
	
	@Autowired
	ClientInfoMapper clientInfoMapper;
	
	//添加客户信息
	@Override
	public int insertClientInfo(ClientInfo clientInfo) {
		return clientInfoMapper.insertClientInfo(clientInfo);
	}

}
