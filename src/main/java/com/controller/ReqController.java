package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;

@RestController
public class ReqController {
	@RequestMapping("/getMenberMsg")
	public List<User> getMemberMsg() {
		List<User> arrs = new ArrayList<>();
		User user = new User();
		user.setUserAge("15");
		user.setUserName("Jason");
		arrs.add(user);
		return arrs;
	}

}
