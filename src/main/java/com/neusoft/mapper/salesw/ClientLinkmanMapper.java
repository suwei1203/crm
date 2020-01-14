package com.neusoft.mapper.salesw;

import org.apache.ibatis.annotations.Mapper;
import com.neusoft.entity.ClientLinkman;

@Mapper
public interface ClientLinkmanMapper {

	//添加联系人信息
	public int insertClientLinkman(ClientLinkman clientLinkman);
}
