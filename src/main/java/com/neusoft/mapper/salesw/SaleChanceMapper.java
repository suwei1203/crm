package com.neusoft.mapper.salesw;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.entity.SaleChance;

@Mapper
public interface SaleChanceMapper {

	public int insertSaleChance(SaleChance saleChance);

	public int selectSaleChanceCount(SaleChance saleChance);

	@Select("select * from  saleChance where chanceId=#{chanceId}")
	public SaleChance selectSaleChanceByChanceId(SaleChance saleChance);

	public int updateSaleChance(SaleChance saleChance);

	@Delete("delete from saleChance where chanceId=#{chanceId}")
	public int delSaleChance(SaleChance saleChance);

	public List<SaleChance> selectSaleChancePaging(SaleChance saleChance);

	public int selectLastChanceId();
}
