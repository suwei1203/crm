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
	
	//添加销售计划
	@Override
	public int insertSalePlan(SalePlan SalePlan) {
		return salePlanMapper.insertSalePlan(SalePlan);
	}
	
	//动态条件（销售机会Id或销售计划Id）查询所属计划
	@Override
	public List<SalePlan> selectSalePlanByCondition(SalePlan SalePlan){
		return salePlanMapper.selectSalePlanByCondition(SalePlan);
	}
	
	//删除销售计划
	@Override
	public int delSalePlan(SalePlan SalePlan) {
		return salePlanMapper.delSalePlan(SalePlan);
	}
	
	//修改销售计划
	@Override
	public int updateSalePlan(SalePlan SalePlan) {
		return salePlanMapper.updateSalePlan(SalePlan);
	}

}
