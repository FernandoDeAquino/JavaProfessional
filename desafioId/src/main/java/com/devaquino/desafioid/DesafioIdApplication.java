package com.devaquino.desafioid;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devaquino.desafioid.entities.Order;
import com.devaquino.desafioid.services.OrderService;

@SpringBootApplication
public class DesafioIdApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioIdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		System.out.print("Código : ");
		Integer code = sc.nextInt();
		System.out.print("Valor : ");
		double valor = sc.nextDouble();
		System.out.print("Desconto : ");
		double discount =  sc.nextDouble();

		Order order = new Order(code,valor,discount);
		
		System.out.printf("Total = %.2f%n", orderService.total(order));
		sc.close();
	}
	
}


