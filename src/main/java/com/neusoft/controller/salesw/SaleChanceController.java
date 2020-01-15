package com.neusoft.controller.salesw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.SaleChance;
import com.neusoft.service.salesw.SaleChanceService;

@RestController
public class SaleChanceController {
	
	@Autowired
	SaleChanceService  saleChanceService;
	
	//添加销售机会
	@RequestMapping("/insertSaleChance")
	public int insertSaleChance(@RequestBody SaleChance saleChance) {
		return saleChanceService.insertSaleChance(saleChance);
	}
	
	// 按条件查询销售机会总行数
	@RequestMapping("/selectSaleChanceCount")
	public int selectSaleChanceCount(@RequestBody SaleChance saleChance) {
		return saleChanceService.selectSaleChanceCount(saleChance);
	}
		
	// 按ID查询销售机会
	@RequestMapping("/selectSaleChanceByChanceId")
	public SaleChance selectSaleChanceByChanceId(@RequestBody SaleChance saleChance) {
		return saleChanceService.selectSaleChanceByChanceId(saleChance);
	}
	
	//修改销售机会
	@RequestMapping("/updateSaleChance")
	public int updateSaleChance(@RequestBody SaleChance saleChance) {
		return saleChanceService.updateSaleChance(saleChance);
	}
	
	//删除销售机会
	@RequestMapping("/delSaleChance")
	public int delSaleChance(@RequestBody SaleChance saleChance) {
		return saleChanceService.delSaleChance(saleChance);
	}
	
	//按条件查询销售机会（分页）
	@RequestMapping("/selectSaleChancePaging")
	public List<SaleChance> selectSaleChancePaging(@RequestBody SaleChance saleChance){
		return saleChanceService.selectSaleChancePaging(saleChance);
	}
	
	//查询出下一个新增销售机会的Id 用于新增销售机会组件的id显示
	@RequestMapping("/selectLastChanceId")
	public int selectLastChanceId(){
		return saleChanceService.selectLastChanceId();
	}
	
	
	
	
}
