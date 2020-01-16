package com.neusoft.service.custsw;

import java.util.List;

import com.neusoft.entity.Orders;

public interface OrdersService {
	// 查询客户的所有订单
	public List<Orders> selectOrdersAll(String clientCode);
}
