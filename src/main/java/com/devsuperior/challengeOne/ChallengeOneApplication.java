package com.devsuperior.challengeOne;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class ChallengeOneApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//PARA TESTAR SE O CÓDIGO ESTÁ FUNCIONANDO - FORMA 1: TROCANDO OS VALORES DIRETO NO OBJETO.

		Order order = new Order(1034, 150.00, 20);
		//double returnToUser = orderService.total(order);
		System.out.printf("\n\nPedido código: %d \nValor total: R$ %.2f", order.getCode(), orderService.total(order));


		// PARA TESTAR SE O CÓDIGO ESTÁ FUNCIONANDO - FORMA 2: COM INPUTS DO USUARIO

		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 3; i++) {
			System.out.print("\nDigite o código do pedido: ");
			int code = sc.nextInt();
			sc.nextLine();

			System.out.print("Digite o valor básico do pedido: ");
			double basic = sc.nextDouble();
			sc.nextLine();

			System.out.print("Digite a porcentagem de desconto do pedido: ");
			double discount = sc.nextDouble();

			Order order = new Order(code, basic, discount);
			System.out.printf("\n\nPedido código: %d \nValor total: R$ %.2f \n", order.getCode(), orderService.total(order));

		 */
		}
	}

