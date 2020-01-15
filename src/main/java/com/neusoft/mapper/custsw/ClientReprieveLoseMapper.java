package com.neusoft.mapper.custsw;

import com.neusoft.entity.ClientInfo;
import com.neusoft.entity.ClientReprieveLose;

public interface ClientReprieveLoseMapper {
//	客户暂缓流失
	public int insertClientReprieveLose(ClientReprieveLose clientReprieveLose);
	public int updateClientInfo(ClientInfo clientinfo);
	
	
//	客户确认流失
	public int updateClientLose(ClientInfo clientInfo);
}
