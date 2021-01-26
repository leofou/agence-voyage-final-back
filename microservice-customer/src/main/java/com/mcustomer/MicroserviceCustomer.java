package com.mcustomer;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mcustomer.entities.Customer;
import com.mcustomer.repositories.CustomerRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceCustomer {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCustomer.class, args);
		
		
	}
	
/*	@Bean
	CommandLineRunner start(CustomerRepository volRepository) {
		return (args) -> {
			Stream.of(new Customer("Madrid", "Vol pour Madrid"), 
					  new Customer("Paris", "Un peu long"), 
					  new Customer("New York", "L'avion est pas top"),
					  new Customer("Sao-Paulo", "Luxueux"), 
					  new Customer("London", "Du thé vous sera proposé"))
					.forEach((v) -> {
						volRepository.save(v);
					});

		};
	} */


}
