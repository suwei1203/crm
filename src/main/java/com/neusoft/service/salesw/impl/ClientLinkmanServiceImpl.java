package com.neusoft.service.salesw.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.ClientInfo;
import com.neusoft.entity.ClientLinkman;
import com.neusoft.mapper.salesw.ClientInfoMapper;
import com.neusoft.mapper.salesw.ClientLinkmanMapper;
import com.neusoft.service.salesw.ClientInfoService;
import com.neusoft.service.salesw.ClientLinkmanService;

@Service
public class ClientLinkmanServiceImpl implements ClientLinkmanService {
	
	@Autowired
	ClientLinkmanMapper clientLinkmanMapper;
	
	//添加联系人信息
	@Override
	public int insertClientLinkman(ClientLinkman clientLinkman) {
		return clientLinkmanMapper.insertClientLinkman(clientLinkman);
	}
	


}
