package com.neusoft.mapper.salesw;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.neusoft.entity.SalePlan;

@Mapper
public interface SalePlanMapper {

	public int insertSalePlan(SalePlan SalePlan);
	
	//根据销售机会Id查询所属计划
	public List<SalePlan> selectSalePlanByPlanChcId(SalePlan SalePlan);

}
