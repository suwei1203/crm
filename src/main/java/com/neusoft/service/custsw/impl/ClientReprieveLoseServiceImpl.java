package com.neusoft.service.custsw.impl;

import com.neusoft.entity.ClientInfo;
import com.neusoft.entity.ClientReprieveLose;
import com.neusoft.mapper.custsw.ClientReprieveLoseMapper;
import com.neusoft.service.custsw.ClientReprieveLoseService;

public class ClientReprieveLoseServiceImpl implements ClientReprieveLoseService {
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
