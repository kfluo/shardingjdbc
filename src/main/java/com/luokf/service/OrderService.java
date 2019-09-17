package com.luokf.service;


import com.luokf.domain.Order;

public interface OrderService {
	void save(Order address);

	Order get(Long id);
}
