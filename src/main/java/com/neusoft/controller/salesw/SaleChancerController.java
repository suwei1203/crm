package com.neusoft.controller.salesw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.SaleChance;
import com.neusoft.service.salesw.SaleChanceService;

@RestController
public class SaleChancerController {
	
	@Autowired
	SaleChanceService  saleChanceService;
	
	@RequestMapping("/insertSaleChance")
	public int insertSaleChance(@RequestBody SaleChance saleChance) {
		return saleChanceService.insertSaleChance(saleChance);
	}
	
	@RequestMapping("/selectSaleChanceCount")
	public int selectSaleChanceCount(@RequestBody SaleChance saleChance) {
		return saleChanceService.selectSaleChanceCount(saleChance);
	}
		
	@RequestMapping("/selectSaleChanceByChanceId")
	public SaleChance selectSaleChanceByChanceId(@RequestBody SaleChance saleChance) {
		return saleChanceService.selectSaleChanceByChanceId(saleChance);
	}
	
	@RequestMapping("/updateSaleChance")
	public int updateSaleChance(@RequestBody SaleChance saleChance) {
		return saleChanceService.updateSaleChance(saleChance);
	}
	
	@RequestMapping("/delSaleChance")
	public int delSaleChance(@RequestBody SaleChance saleChance) {
		return saleChanceService.delSaleChance(saleChance);
	}
	
	@RequestMapping("/selectSaleChancePaging")
	public List<SaleChance> selectSaleChancePaging(@RequestBody SaleChance saleChance){
		return saleChanceService.selectSaleChancePaging(saleChance);
	}
	
	@RequestMapping("/selectLastChanceId")
	public int selectLastChanceId(){
		return saleChanceService.selectLastChanceId();
	}
	
	
	
	
}
