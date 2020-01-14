package com.neusoft.service.system.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.entity.SysUser;
import com.neusoft.mapper.salesw.SysUserMapper;
import com.neusoft.service.system.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	SysUserMapper sysUserMapper;
	
	@Override
	public SysUser selectSysUserByuserNameByuserPassword(SysUser sysUser) {
		return sysUserMapper.selectSysUserByuserNameByuserPassword(sysUser);
	}
	
	@Override
	public List<SysUser> selectSysUserByCondition(SysUser sysUser){
		return sysUserMapper.selectSysUserByCondition(sysUser);
	}
}
