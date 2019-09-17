package com.luokf.mapper;


import com.luokf.domain.User;

public interface UserMapper {
	/**
	 * 保存
	 */
	void save(User user);
	
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	User get(Long id);
}
