package com.neusoft.mapper.custsw;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.entity.Orders;

@Mapper
public interface OrdersMapper {
//	查询客户的所有订单
	public List<Orders> selectOrdersAll(String clientCode);
}
