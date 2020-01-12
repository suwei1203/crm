package com.neusoft.service.salesw;

import java.util.List;

import com.neusoft.entity.SysUser;

public interface SysUserService {
	
	public SysUser selectSysUserByuserNameByuserPassword(SysUser sysUser);
	
	public List<SysUser> selectSysUserByCondition(SysUser sysUser);
}
