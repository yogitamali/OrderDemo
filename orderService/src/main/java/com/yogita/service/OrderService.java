package com.yogita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogita.dao.OrderRepository;
import com.yogita.entity.Order;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	

	public Order saveOrder(Order order) {

		return repository.save(order);
	}
	
	

}
