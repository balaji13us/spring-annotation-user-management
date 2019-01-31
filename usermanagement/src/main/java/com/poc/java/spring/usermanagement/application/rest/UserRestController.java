package com.poc.java.spring.usermanagement.application.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.java.spring.usermanagement.application.response.vo.UserResponse;
import com.poc.java.spring.usermanagement.application.vo.UserVO;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public UserResponse fetchUsers() {
		
		
		return createDataUsers();
		
	}
	
	public UserResponse createDataUsers()
	{
		UserVO user = new UserVO();
		user.setFirstName("Balaji");
		user.setLastName("SIvakumar");
		List<UserVO> userList = new ArrayList<UserVO>();
		userList.add(user);
		
		UserResponse userResponse = new UserResponse();
		userResponse.setUserVO(userList);
		
		return userResponse;
	}
	
}
