package com.neusoft.service.salesw;

import java.util.List;

import com.neusoft.entity.SalePlan;

public interface SalePlanService {
	
	//添加销售计划
	public int insertSalePlan(SalePlan SalePlan);
	
	//动态条件（销售机会Id或销售计划Id）查询所属计划
	public List<SalePlan> selectSalePlanByCondition(SalePlan SalePlan);
	
	//删除销售计划
	public int delSalePlan(SalePlan SalePlan);
	
	//修改销售计划
	public int updateSalePlan(SalePlan SalePlan);
	
}
