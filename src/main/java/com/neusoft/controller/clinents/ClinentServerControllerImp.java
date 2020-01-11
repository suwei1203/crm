package com.neusoft.controller.clinents;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.neusoft.entity.ClientServer;
import com.neusoft.service.clients.ClinentServerService;

//客户服务的控制层实现类（孙开）
@Controller
public class ClinentServerControllerImp implements ClinentServerController {
	
	@Autowired
	private ClinentServerService css;

	@Override
	public int insertData(ClientServer cs) {
		// TODO Auto-generated method stub
		return css.insertData(cs);
	}

	@Override
	public List<ClientServer> selectUndistributed(int serverStatus) {
		// TODO Auto-generated method stub
		return css.selectUndistributed(serverStatus);
	}

	@Override
	public List<ClientServer> selectUndistributedByConditions(String clientCode, String serverTitle, int serverTypeId,
			int serverStatus) {
		// TODO Auto-generated method stub
		return css.selectUndistributedByConditions(clientCode, serverTitle, serverTypeId, serverStatus);
	}

	@Override
	public int updateDue(int serverDueId, String serverDueDate, int serverId) {
		// TODO Auto-generated method stub
		return css.updateDue(serverDueId, serverDueDate, serverId);
	}

	@Override
	public int deleteByserverId(int serverId) {
		// TODO Auto-generated method stub
		return css.deleteByserverId(serverId);
	}

	@Override
	public int updateProcessing(String serverProcessing, String processingDate, int serverId) {
		// TODO Auto-generated method stub
		return css.updateProcessing(serverProcessing, processingDate, serverId);
	}

	@Override
	public int updateFeedback(String processingResult, int clientContentment, int serverId) {
		// TODO Auto-generated method stub
		return css.updateFeedback(processingResult, clientContentment, serverId);
	}

	@Override
	public ClientServer selectByServerId(int serverId) {
		// TODO Auto-generated method stub
		return css.selectByServerId(serverId);
	}

}
