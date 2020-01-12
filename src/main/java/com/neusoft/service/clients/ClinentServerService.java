package com.neusoft.service.clients;

import java.util.List;

import com.neusoft.entity.ClientServer;

//客户服务的服务层接口（孙开）
public interface ClinentServerService {
	//服务创建界面需要的操作
		public int insertData(ClientServer cs);
		
		//显示分配、处理、反馈、归档界面时要用到的查询
		public List<ClientServer> selectUndistributed(int serverStatus);
		public List<ClientServer> selectUndistributedByConditions(String clientCode,String serverTitle,int serverTypeId,int serverStatus);
		
		//服务分配界面需要的操作
		public int updateDue(int serverDueId,String serverDueDate,int serverId);
		public int deleteByserverId(int serverId); 
		
		//服务处理界面需要的操作
		public int updateProcessing(String serverProcessing, String processingDate,int serverId);
		
		//服务反馈界面需要的操作
		public int updateFeedback(String processingResult,int clientContentment,int serverId);
		
		//服务归档界面需要的操作
		public ClientServer selectByServerId(int serverId);

}
