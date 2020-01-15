package com.neusoft.service.custsw.impl;

import java.util.List;

import com.neusoft.entity.Orders;
import com.neusoft.mapper.custsw.OrdersMapper;
import com.neusoft.service.custsw.OrdersService;

public class OrdersServiceImpl implements OrdersService {
	OrdersMapper ordersMapper;

	// 查询客户的所有订单
	@Override
	public List<Orders> selectOrdersAll(String clientCode) {
		return ordersMapper.selectOrdersAll(clientCode);
	}

}
