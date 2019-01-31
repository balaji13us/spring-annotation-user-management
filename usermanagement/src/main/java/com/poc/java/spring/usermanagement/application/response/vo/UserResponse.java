package com.poc.java.spring.usermanagement.application.response.vo;

import java.io.Serializable;
import java.util.List;

import com.poc.java.spring.usermanagement.application.vo.UserVO;

public class UserResponse extends BaseResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4602037389776830088L;
	private List<UserVO> UserVO;

	public List<UserVO> getUserVO() {
		return UserVO;
	}

	public void setUserVO(List<UserVO> userVO) {
		UserVO = userVO;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CLASS_NAME=UserRequest [ UserVO=\"");
		builder.append(UserVO);
		builder.append("\" ]");
		return builder.toString();
	}
	
}
