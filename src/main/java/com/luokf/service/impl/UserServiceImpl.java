package com.luokf.service.impl;

import java.util.Date;

import com.luokf.domain.User;
import com.luokf.mapper.UserMapper;
import com.luokf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	
		@Autowired
		private UserMapper userMapper;

		@Override
		public void save(User user) {
			user.setCreateTime(new Date());
			userMapper.save(user);
		}

		@Override
		public User get(Long id) {
			// TODO Auto-generated method stub
			return userMapper.get(id);
		}
		
		
}
