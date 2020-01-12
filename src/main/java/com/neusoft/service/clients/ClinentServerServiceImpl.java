package com.neusoft.service.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.ClientServer;
import com.neusoft.mapper.clinents.ClinentServerMapper;

//客户服务的服务层实现类（孙开）
@Service
public class ClinentServerServiceImpl implements ClinentServerService {
	
	@Autowired
	private ClinentServerMapper csm;

	@Override
	public int insertData(ClientServer cs) {
		// TODO Auto-generated method stub
		return csm.insertData(cs);
	}

	@Override
	public List<ClientServer> selectUndistributed(int serverStatus) {
		// TODO Auto-generated method stub
		return csm.selectUndistributed(serverStatus);
	}

	@Override
	public List<ClientServer> selectUndistributedByConditions(String clientCode, String serverTitle, int serverTypeId,
			int serverStatus) {
		// TODO Auto-generated method stub
		return csm.selectUndistributedByConditions(clientCode, serverTitle, serverTypeId, serverStatus);
	}

	@Override
	public int updateDue(int serverDueId, String serverDueDate, int serverId) {
		// TODO Auto-generated method stub
		return csm.updateDue(serverDueId, serverDueDate, serverId);
	}

	@Override
	public int deleteByserverId(int serverId) {
		// TODO Auto-generated method stub
		return csm.deleteByserverId(serverId);
	}

	@Override
	public int updateProcessing(String serverProcessing, String processingDate, int serverId) {
		// TODO Auto-generated method stub
		return csm.updateProcessing(serverProcessing, processingDate, serverId);
	}

	@Override
	public int updateFeedback(String processingResult, int clientContentment, int serverId) {
		// TODO Auto-generated method stub
		return csm.updateFeedback(processingResult, clientContentment, serverId);
	}

	@Override
	public ClientServer selectByServerId(int serverId) {
		// TODO Auto-generated method stub
		return csm.selectByServerId(serverId);
	}

}
