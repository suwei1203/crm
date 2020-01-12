package com.neusoft.service.salesw.impl;

import java.util.List;

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
	public int selectSaleChanceCount(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChanceCount(saleChance);
	}
	
	@Override
	public int updateSaleChance(SaleChance saleChance) {
		return saleChanceMapper.updateSaleChance(saleChance);
	}
	
	@Override
	public SaleChance selectSaleChanceByChanceId(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChanceByChanceId(saleChance);
	}
	
	@Override
	public int delSaleChance(SaleChance saleChance) {
		return saleChanceMapper.delSaleChance(saleChance);
	}
	
	@Override
	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance){
		return saleChanceMapper.selectSaleChancePaging(saleChance);
	}
	
	@Override
	public int selectLastChanceId() {
		return saleChanceMapper.selectLastChanceId();
	}
	
	
	
	

}
