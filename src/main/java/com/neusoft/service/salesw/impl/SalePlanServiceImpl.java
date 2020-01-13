package com.neusoft.service.salesw.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.SalePlan;
import com.neusoft.mapper.salesw.SalePlanMapper;
import com.neusoft.service.salesw.SalePlanService;

@Service
public class SalePlanServiceImpl implements SalePlanService {

	@Autowired
	SalePlanMapper salePlanMapper;
	
	@Override
	public int insertSalePlan(SalePlan SalePlan) {
		return salePlanMapper.insertSalePlan(SalePlan);
	}
	
	@Override
	public List<SalePlan> selectSalePlanByPlanChcId(SalePlan SalePlan){
		return salePlanMapper.selectSalePlanByPlanChcId(SalePlan);
	}
	
	@Override
	public int delSalePlan(SalePlan SalePlan) {
		return salePlanMapper.delSalePlan(SalePlan);
	}
	
	@Override
	public int updateSalePlan(SalePlan SalePlan) {
		return salePlanMapper.updateSalePlan(SalePlan);
	}

}
