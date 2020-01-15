package com.neusoft.service.salesw;

import java.util.List;

import com.neusoft.entity.SaleChance;

public interface SaleChanceService {
	
	//添加销售机会
	public int insertSaleChance(SaleChance saleChance);
	
	// 按条件查询销售机会总行数
	public int selectSaleChanceCount(SaleChance saleChance);	
	
	// 按ID查询销售机会
	public SaleChance selectSaleChanceByChanceId(SaleChance saleChance);
	
	//修改销售机会
	public int updateSaleChance(SaleChance saleChance);
	
	//删除销售机会
	public int delSaleChance(SaleChance saleChance);
	
	//按条件查询销售机会（分页）
	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance);
	
	//查询出下一个新增销售机会的Id 用于新增销售机会组件的id显示
	public int selectLastChanceId();
}
