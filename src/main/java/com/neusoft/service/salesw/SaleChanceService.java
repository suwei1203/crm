package com.neusoft.service.salesw;

import java.util.List;

import com.neusoft.entity.SaleChance;

public interface SaleChanceService {
	
	public int insertSaleChance(SaleChance saleChance);
	
	public int selectSaleChanceCount(SaleChance saleChance);	
	
	public SaleChance selectSaleChanceByChanceId(SaleChance saleChance);
	
	public int updateSaleChance(SaleChance saleChance);
	
	public int delSaleChance(SaleChance saleChance);
	
	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance);
	
	public int selectLastChanceId();
}
