package com.neusoft.service.salesw;

import com.neusoft.entity.SaleChance;

public interface SaleChanceService {
	
	public int insertSaleChance(SaleChance saleChance);
	
	public int selectSaleChanceCount();	
	
	public SaleChance selectSaleChanceCountByChanceId(SaleChance saleChance);
	
	public int updateSaleChance(SaleChance saleChance);
	
	public int delSaleChance(SaleChance saleChance);
}
