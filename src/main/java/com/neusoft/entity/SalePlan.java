package com.neusoft.entity;

public class SalePlan {
	
	private Integer planId;
	private Integer planChcId;
	private String planTodo;
	private String planResult;
	
	public Integer getPlanId() {
		return planId;
	}
	public Integer getPlanChcId() {
		return planChcId;
	}
	public String getPlanTodo() {
		return planTodo;
	}
	public String getPlanResult() {
		return planResult;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public void setPlanChcId(Integer planChcId) {
		this.planChcId = planChcId;
	}
	public void setPlanTodo(String planTodo) {
		this.planTodo = planTodo;
	}
	public void setPlanResult(String planResult) {
		this.planResult = planResult;
	}
	
	
}
