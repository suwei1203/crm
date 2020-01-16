package com.neusoft.controller.custsw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.ClientInfo;
import com.neusoft.service.custsw.ClientInfoService;

@RestController
public class ClientInfoController {
	@Autowired
	ClientInfoService clientInfoService;
	
	// 编辑客户信息,客户经理可以编辑状态为“正常”的客户信息
	@RequestMapping("/updateClientInfo")
	public int updateClientInfo(@RequestBody ClientInfo clientInfo) {
		return clientInfoService.updateClientInfo(clientInfo);
	}

	// 查询全部客户信息
	@RequestMapping("/selectClientInfoAll")
	public List<ClientInfo> selectClientInfoAll() {
		return clientInfoService.selectClientInfoAll();
	}

	// 查询六个月没有下订单的客户信息
	@RequestMapping("/selectClientInofByOrdersDate")
	public List<ClientInfo> selectClientInofByOrdersDate() {
		return clientInfoService.selectClientInofByOrdersDate();
	}
	
	//添加客户信息
	@RequestMapping("/insertClientInfo")
	public int insertClientInfo(@RequestBody ClientInfo clientInfo) {
		return clientInfoService.insertClientInfo(clientInfo);
	}
}
