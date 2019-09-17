package com.luokf.service;

import com.luokf.domain.User;

public interface IUserService {
	
	void save(User user);

	User get(Long l);
}	
