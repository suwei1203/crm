package com.neusoft.controller.custsw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.Orders;
import com.neusoft.service.custsw.OrdersService;

@RestController
public class OrdersController {
	@Autowired
	OrdersService ordersService;

	@RequestMapping("/selectOrdersAll")
	// 查询客户的所有订单
	public List<Orders> selectOrdersAll(@RequestBody String clientCode) {
		return ordersService.selectOrdersAll(clientCode);
	}

}
