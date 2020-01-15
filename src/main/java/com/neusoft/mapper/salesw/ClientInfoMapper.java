package com.neusoft.mapper.salesw;

import org.apache.ibatis.annotations.Mapper;
import com.neusoft.entity.ClientInfo;

@Mapper
public interface ClientInfoMapper {

	//添加客户信息
	public int insertClientInfo(ClientInfo clientInfo);
}
