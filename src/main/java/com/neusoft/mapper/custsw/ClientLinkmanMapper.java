package com.neusoft.mapper.custsw;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.entity.ClientLinkman;

@Mapper
public interface ClientLinkmanMapper {
	// 增加客户的联系人
	public int insertClientLinkman(ClientLinkman clientLinkman);

	// 修改客户的联系人
	public int updateClientLinkman(ClientLinkman clientLinkman);

	// 查询客户的全部联系人
	public List<ClientLinkman> selectClientLinkmanAll(int clientCode);
}
