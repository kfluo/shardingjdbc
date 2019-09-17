package com.luokf.controller;

import com.luokf.domain.User;
import com.luokf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/user/save")
	@ResponseBody
	public String save(User user) {
		userService.save(user);
		return "success";
	}
	
	@RequestMapping("/user/get/{id}")
	@ResponseBody
	public User get(@PathVariable Long id) {
		User user =  userService.get(id);
		System.out.println(user.getId());
		return user;
	}
	
	
	

}
