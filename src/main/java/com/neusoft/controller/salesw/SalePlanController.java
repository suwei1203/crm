package com.neusoft.controller.salesw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.SalePlan;
import com.neusoft.service.salesw.SalePlanService;

@RestController
public class SalePlanController {

	@Autowired
	SalePlanService salePlanService;

	//添加销售计划
	@RequestMapping("/insertSalePlan")
	public int insertSalePlan(@RequestBody SalePlan SalePlan) {
		return salePlanService.insertSalePlan(SalePlan);
	}
	
	//动态条件（销售机会Id或销售计划Id）查询所属计划
	@RequestMapping("/selectSalePlanByCondition")
	public List<SalePlan> selectSalePlanByCondition(@RequestBody SalePlan SalePlan){
		return salePlanService.selectSalePlanByCondition(SalePlan);
	}
	
	//删除销售计划
	@RequestMapping("/delSalePlan")
	public int delSalePlan(@RequestBody  SalePlan SalePlan) {
		return salePlanService.delSalePlan(SalePlan);
	}
	
	//修改销售计划
	@RequestMapping("/updateSalePlan")
	public int updateSalePlan(@RequestBody SalePlan SalePlan) {
		return salePlanService.updateSalePlan(SalePlan);
	}
}
