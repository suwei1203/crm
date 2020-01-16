package com.neusoft.service.custsw.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.ClientInfo;
import com.neusoft.entity.ClientReprieveLose;
import com.neusoft.mapper.custsw.ClientReprieveLoseMapper;
import com.neusoft.service.custsw.ClientReprieveLoseService;

@Service
public class ClientReprieveLoseServiceImpl implements ClientReprieveLoseService {
	@Autowired
	ClientReprieveLoseMapper clientReprieveLoseMapper;

	@Override
	// 客户暂缓流失
	public int insertClientReprieveLose(ClientReprieveLose clientReprieveLose) {
		return clientReprieveLoseMapper.insertClientReprieveLose(clientReprieveLose);
	}

	@Override
	public int updateClientInfo(ClientInfo clientinfo) {
		return clientReprieveLoseMapper.updateClientInfo(clientinfo);
	}

	// 客户确认流失
	@Override
	public int updateClientLose(ClientInfo clientInfo) {
		return clientReprieveLoseMapper.updateClientLose(clientInfo);
	}

}
