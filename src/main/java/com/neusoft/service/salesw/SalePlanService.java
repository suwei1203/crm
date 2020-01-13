package com.neusoft.service.salesw;

import java.util.List;

import com.neusoft.entity.SalePlan;

public interface SalePlanService {
	
	public int insertSalePlan(SalePlan SalePlan);
	
	public List<SalePlan> selectSalePlanByPlanChcId(SalePlan SalePlan);
	
}
