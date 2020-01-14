package com.neusoft.service.system;

import java.util.List;

import com.neusoft.entity.SysUser;

public interface SysUserService {
	
	public SysUser selectSysUserByuserNameByuserPassword(SysUser sysUser);
	
	public List<SysUser> selectSysUserByCondition(SysUser sysUser);
}
