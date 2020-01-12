package com.neusoft.mapper.salesw;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.entity.SysUser;

@Mapper
public interface SysUserMapper {
	
	public SysUser selectSysUserByuserNameByuserPassword(SysUser sysUser);
	
	public List<SysUser> selectSysUserByCondition(SysUser sysUser);
	
}
