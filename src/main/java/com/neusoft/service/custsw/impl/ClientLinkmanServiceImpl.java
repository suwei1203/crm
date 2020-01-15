package com.neusoft.service.custsw.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.entity.ClientLinkman;
import com.neusoft.mapper.custsw.ClientLinkmanMapper;
import com.neusoft.service.custsw.ClientLinkmanService;

public class ClientLinkmanServiceImpl implements ClientLinkmanService {
	@Autowired
	ClientLinkmanMapper clientLinkmanMapper;

	// 增加客户的联系人
	@Override
	public int insertClientLinkMan(ClientLinkman clientLinkman) {
		return clientLinkmanMapper.insertClientLinkman(clientLinkman);
	}

	// 修改客户的联系人
	@Override
	public int updateClientLinkMan(ClientLinkman clientLinkman) {
		return clientLinkmanMapper.updateClientLinkman(clientLinkman);
	}

	// 查询客户的全部联系人
	@Override
	public List<ClientLinkman> selectClientLinkmanAll(Integer clientCode) {
		return clientLinkmanMapper.selectClientLinkmanAll(clientCode);
	}

}
