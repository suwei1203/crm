package com.neusoft.controller.salesw;

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
	public int selectSaleChanceCount() {
		return saleChanceService.selectSaleChanceCount();
	}
}
