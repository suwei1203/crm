package com.neusoft.controller.custsw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.ClientInfo;
import com.neusoft.entity.ClientReprieveLose;
import com.neusoft.service.custsw.ClientReprieveLoseService;

@RestController
public class ClientReprieveLoseController {
	@Autowired
	ClientReprieveLoseService clientReprieveLoseService;
	
	@RequestMapping("/insertClientReprieveLose")
	public int insertClientReprieveLose(ClientReprieveLose clientReprieveLose) {
		return clientReprieveLoseService.insertClientReprieveLose(clientReprieveLose);
	}
	
	@RequestMapping("/updateClientLose")
	public int updateClientLose(ClientInfo clientInfo) {
		return clientReprieveLoseService.updateClientLose(clientInfo);
	}
}
