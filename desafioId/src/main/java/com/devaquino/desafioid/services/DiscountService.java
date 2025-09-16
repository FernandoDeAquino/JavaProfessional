package com.devaquino.desafioid.services;

import org.springframework.stereotype.Service;

import com.devaquino.desafioid.entities.Order;

@Service
public class DiscountService {
	
	private double tax;
	
	public double discountCalc(Order order) {
		
		tax = (order.getBasic() * (order.getDiscount()/100));			
		
		return (order.getBasic() - tax);
	}
	
}
