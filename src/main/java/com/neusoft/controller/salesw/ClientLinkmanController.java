package com.neusoft.controller.salesw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.ClientInfo;
import com.neusoft.entity.ClientLinkman;
import com.neusoft.service.salesw.ClientInfoService;
import com.neusoft.service.salesw.ClientLinkmanService;

@RestController
public class ClientLinkmanController {
	
	@Autowired
	ClientLinkmanService  clientLinkmanService;
	
	//添加联系人信息
	@RequestMapping("/insertClientLinkman")
	public int insertClientLinkman(@RequestBody ClientLinkman clientLinkman) {
		return clientLinkmanService.insertClientLinkman(clientLinkman);
	}
	
	
	
	
	
}
