package com.neusoft.entity;

public class SysUser {
	
	private Integer userId;
	private String userName;
	private String userPassword;
	private Integer daId;
	private Integer userRoleId;
	private Integer userFlag;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getDaId() {
		return daId;
	}
	public void setDaId(Integer daId) {
		this.daId = daId;
	}
	public Integer getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}
	public Integer getUserFlag() {
		return userFlag;
	}
	public void setUserFlag(Integer userFlag) {
		this.userFlag = userFlag;
	}
	
	
}
