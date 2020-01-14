package com.neusoft.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.entity.SysUser;
import com.neusoft.service.system.SysUserService;

@RestController
public class SysUserController {

	@Autowired
	SysUserService sysUserService;

	@RequestMapping("/selectSysUserByuserNameByuserPassword")
	public SysUser selectSysUserByuserNameByuserPassword(@RequestBody SysUser sysUser) {
		return sysUserService.selectSysUserByuserNameByuserPassword(sysUser);
	}
	
	@RequestMapping("/selectSysUserByCondition")
	public List<SysUser> selectSysUserByCondition(@RequestBody SysUser sysUser){
		return sysUserService.selectSysUserByCondition(sysUser);
	}

}
