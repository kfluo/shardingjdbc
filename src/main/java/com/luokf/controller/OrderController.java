package com.luokf.controller;

import com.luokf.domain.Order;
import com.luokf.service.OrderService;
import com.luokf.utils.SnowFlakeGenerator;
import com.luokf.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService addressService;
	
	@RequestMapping("/order/save")
	@ResponseBody
	public String save(Long userId) {
		Order order = new Order();
		order.setId(SnowflakeIdWorker.generateId());
		order.setUserId(userId);
		order.setOrderNo(order.getId()+"");
		order.setCreateTime(new Date());
		order.setOrderStatus(1);
		addressService.save(order);
		return "success";
	}
	
	@RequestMapping("/order/get/{id}")
	@ResponseBody
	public Order get(@PathVariable Long id) {
		return addressService.get(id);
	}
}
