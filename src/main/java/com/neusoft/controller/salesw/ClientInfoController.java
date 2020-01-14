package com.neusoft.controller.salesw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.ClientInfo;
import com.neusoft.service.salesw.ClientInfoService;

@RestController
public class ClientInfoController {
	
	@Autowired
	ClientInfoService  clientInfoService;
	
	//添加客户信息
	@RequestMapping("/insertClientInfo")
	public int insertClientInfo(@RequestBody ClientInfo clientInfo) {
		return clientInfoService.insertClientInfo(clientInfo);
	}
	
	
	
	
	
}
