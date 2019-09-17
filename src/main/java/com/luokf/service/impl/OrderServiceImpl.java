package com.luokf.service.impl;

import com.luokf.domain.Order;
import com.luokf.mapper.OrderMapper;
import com.luokf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderMapper addressMapper;

	@Override
	public void save(Order address) {
		// TODO Auto-generated method stub
		addressMapper.save(address);	
	}

	@Override
	public Order get(Long id) {
		// TODO Auto-generated method stub
		return addressMapper.get(id);
	}

}
