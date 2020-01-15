package com.neusoft.service.system;

import java.util.List;

import com.neusoft.entity.SysUser;

public interface SysUserService {
	
	//根据id 密码查询系统用户
	public SysUser selectSysUserByuserNameByuserPassword(SysUser sysUser);
	
	//根据条件 userRoleId（用户职责）查询 系统用户
	public List<SysUser> selectSysUserByCondition(SysUser sysUser);
}
