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

	@RequestMapping("/insertSalePlan")
	public int insertSalePlan(@RequestBody SalePlan SalePlan) {
		return salePlanService.insertSalePlan(SalePlan);
	}
	
	@RequestMapping("/selectSalePlanByPlanChcId")
	public List<SalePlan> selectSalePlanByPlanChcId(@RequestBody SalePlan SalePlan){
		return salePlanService.selectSalePlanByPlanChcId(SalePlan);
	}
	
	@RequestMapping("/delSalePlan")
	public int delSalePlan(@RequestBody  SalePlan SalePlan) {
		return salePlanService.delSalePlan(SalePlan);
	}
	
	@RequestMapping("/updateSalePlan")
	public int updateSalePlan(@RequestBody SalePlan SalePlan) {
		return salePlanService.updateSalePlan(SalePlan);
	}
}
