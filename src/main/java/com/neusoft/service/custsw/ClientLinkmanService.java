package com.neusoft.service.custsw;

import java.util.List;

import com.neusoft.entity.ClientLinkman;

public interface ClientLinkmanService {
	// 增加客户的联系人
	public int insertClientLinkMan(ClientLinkman clientLinkman);

	// 修改客户的联系人
	public int updateClientLinkMan(ClientLinkman clientLinkman);

	// 查询客户的全部联系人
	public List<ClientLinkman> selectClientLinkmanAll(Integer clientCode);
	
	//添加联系人信息
	public int insertClientLinkman(ClientLinkman clientLinkman);
}
