package com.neusoft.entity;
//客户服务的实体类（孙开）
public class ClientServer {
	//服务编号
	private Integer serverId;
	//服务类型编号
	private Integer serverTypeId;
	//概要
	private String serverTitle;
	//客户编号
	private String clientCode;
	//服务状态  1、未分配 2、已分配 3、已处理 4、已反馈
	private Integer serverStatus;
	//服务请求的内容
	private String serverContent;
	//创建人编号
	private Integer serverCreateId;
	//创建日期
	private String serverCreateDate;
	//指派人编号
	private Integer serverDueId;
	//指派日期
	private String serverDueDate;
	//服务处理内容
	private String serverProcessing;
	//处理日期
	private String ProcessingDate;
	//处理结果
	private String ProcessingResult;
	//处理结果满意度 1、☆ 2、☆☆ 3、☆☆☆ 4、☆☆☆☆ 5、☆☆☆☆☆
	private Integer clientContentment;

	public Integer getServerId() {
		return serverId;
	}

	public Integer getServerTypeId() {
		return serverTypeId;
	}

	public String getServerTitle() {
		return serverTitle;
	}

	public String getClientCode() {
		return clientCode;
	}

	public Integer getServerStatus() {
		return serverStatus;
	}

	public String getServerContent() {
		return serverContent;
	}

	public Integer getServerCreateId() {
		return serverCreateId;
	}

	public String getServerCreatDate() {
		return serverCreateDate;
	}

	public Integer getServerDueId() {
		return serverDueId;
	}

	public String getServerDueDate() {
		return serverDueDate;
	}

	public String getServerProcessing() {
		return serverProcessing;
	}

	public String getProcessingDate() {
		return ProcessingDate;
	}

	public String getProcessingResult() {
		return ProcessingResult;
	}

	public Integer getClientContentment() {
		return clientContentment;
	}

	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}

	public void setServerTypeId(Integer serverTypeId) {
		this.serverTypeId = serverTypeId;
	}

	public void setServerTitle(String serverTitle) {
		this.serverTitle = serverTitle;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public void setServerStatus(Integer serverStatus) {
		this.serverStatus = serverStatus;
	}

	public void setServerContent(String serverContent) {
		this.serverContent = serverContent;
	}

	public void setServerCreateId(Integer serverCreateId) {
		this.serverCreateId = serverCreateId;
	}

	public void setServerCreatDate(String serverCreateDate) {
		this.serverCreateDate = serverCreateDate;
	}

	public void setServerDueId(Integer serverDueId) {
		this.serverDueId = serverDueId;
	}

	public void setServerDueDate(String serverDueDate) {
		this.serverDueDate = serverDueDate;
	}

	public void setServerProcessing(String serverProcessing) {
		this.serverProcessing = serverProcessing;
	}

	public void setProcessingDate(String processingDate) {
		ProcessingDate = processingDate;
	}

	public void setProcessingResult(String processingResult) {
		ProcessingResult = processingResult;
	}

	public void setClientContentment(Integer clientContentment) {
		this.clientContentment = clientContentment;
	}

}
