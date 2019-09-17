package com.luokf.mapper;


import com.luokf.domain.Order;

public interface OrderMapper {
	/**
	 * 保存
	 */
	void save(Order address);
	
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	Order get(Long id);
}
