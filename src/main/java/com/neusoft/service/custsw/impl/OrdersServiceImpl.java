package com.neusoft.service.custsw.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.Orders;
import com.neusoft.mapper.custsw.OrdersMapper;
import com.neusoft.service.custsw.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	OrdersMapper ordersMapper;

	// 查询客户的所有订单
	@Override
	public List<Orders> selectOrdersAll(String clientCode) {
		return ordersMapper.selectOrdersAll(clientCode);
	}

}
