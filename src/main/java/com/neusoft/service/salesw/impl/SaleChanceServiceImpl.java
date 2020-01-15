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
	
	//添加销售机会
	@Override
	public int insertSaleChance(SaleChance saleChance) {
		return saleChanceMapper.insertSaleChance(saleChance);
	}
	
	// 按条件查询销售机会总行数
	@Override
	public int selectSaleChanceCount(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChanceCount(saleChance);
	}
	
	// 按ID查询销售机会
	@Override
	public SaleChance selectSaleChanceByChanceId(SaleChance saleChance) {
		return saleChanceMapper.selectSaleChanceByChanceId(saleChance);
	}
	
	//修改销售机会
	@Override
	public int updateSaleChance(SaleChance saleChance) {
		return saleChanceMapper.updateSaleChance(saleChance);
	}
	
	//删除销售机会
	@Override
	public int delSaleChance(SaleChance saleChance) {
		return saleChanceMapper.delSaleChance(saleChance);
	}
	
	//按条件查询销售机会（分页）
	@Override
	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance){
		return saleChanceMapper.selectSaleChancePaging(saleChance);
	}
	
	//查询出下一个新增销售机会的Id 用于新增销售机会组件的id显示
	@Override
	public int selectLastChanceId() {
		return saleChanceMapper.selectLastChanceId();
	}
	
	
	
	

}
