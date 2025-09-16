package com.devaquino.desafioid.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devaquino.desafioid.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingservice;
	
	@Autowired DiscountService discountService;

	public double total(Order order) {
		
		return (discountService.discountCalc(order) + shippingservice.shipment(order));
		
	}
	
}
