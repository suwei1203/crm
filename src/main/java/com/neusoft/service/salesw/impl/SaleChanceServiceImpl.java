package com.neusoft.service.salesw.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.SaleChance;
import com.neusoft.mapper.salesw.SaleChanceMapper;
import com.neusoft.service.salesw.SaleChanceService;

@Service
public class SaleChanceServiceImpl implements SaleChanceService  {
	
	@Autowired
	SaleChanceMapper saleChanceMapper;
	
	@Override
	public int insertSaleChance(SaleChance saleChance) {
		return saleChanceMapper.insertSaleChance(saleChance);
	}
	
	@Override
	public int selectSaleChanceCount() {
		return saleChanceMapper.selectSaleChanceCount();
	}
	
	@Override
	public int updateSaleChance(SaleChance saleChance) {
		return saleChanceMapper.updateSaleChance(saleChance);
	}
	
	@Override
	public SaleChance selectSaleChanceCountByChanceId(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChanceCountByChanceId(saleChance);
	}
	
	@Override
	public int delSaleChance(SaleChance saleChance) {
		return saleChanceMapper.delSaleChance(saleChance);
	}
	
	
	
	

}
