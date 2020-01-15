package com.neusoft.controller.custsw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.ClientLinkman;
import com.neusoft.service.custsw.ClientLinkmanService;

@RestController
public class ClientLinkmanController {
	@Autowired
	ClientLinkmanService clientLinkmanService;

	// 增加客户的联系人
	@RequestMapping("/insertClientLinkMan")
	public int insertClientLinkMan(ClientLinkman clientLinkman) {
		return clientLinkmanService.insertClientLinkMan(clientLinkman);
	}

	// 修改客户的联系人
	@RequestMapping("/updateClientLinkMan")
	public int updateClientLinkMan(ClientLinkman clientLinkman) {
		return clientLinkmanService.updateClientLinkMan(clientLinkman);
	}

	// 查询客户的全部联系人
	@RequestMapping("/selectClientLinkmanAll")
	public List<ClientLinkman> selectClientLinkmanAll(Integer clientCode) {
		return clientLinkmanService.selectClientLinkmanAll(clientCode);
	}
	
	//添加联系人信息
	@RequestMapping("/insertClientLinkman")
	public int insertClientLinkman(@RequestBody ClientLinkman clientLinkman) {
		return clientLinkmanService.insertClientLinkman(clientLinkman);
	}
}
