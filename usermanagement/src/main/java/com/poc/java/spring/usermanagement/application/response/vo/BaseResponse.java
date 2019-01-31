package com.poc.java.spring.usermanagement.application.response.vo;

import java.io.Serializable;

public class BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8229570206050017688L;

	private String message;
	private String status;
	private String code;
	private String description;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CLASS_NAME=BaseResponse [ message=\"");
		builder.append(message);
		builder.append("\", status=\"");
		builder.append(status);
		builder.append("\", code=\"");
		builder.append(code);
		builder.append("\", description=\"");
		builder.append(description);
		builder.append("\" ]");
		return builder.toString();
	}
	
	
	
}
