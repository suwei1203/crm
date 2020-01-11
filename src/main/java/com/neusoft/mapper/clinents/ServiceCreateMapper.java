package com.neusoft.mapper.clinents;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.neusoft.entity.ClientServer;

//服务创建的Mapper（孙开）
@Mapper
public interface ServiceCreateMapper {
	//服务创建界面需要的操作
	public int insertClientServer(ClientServer cs);
	
	//服务分配界面需要的操作
	public ClientServer selectClientServerByserverStatus(int serverStatus);

}
