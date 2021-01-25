package com.mjourney;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mjourney.entities.Journey;
import com.mjourney.repositories.JourneyRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceJourneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceJourneyApplication.class, args);
		
		
	}
	
//	@Bean
//	CommandLineRunner start(JourneyRepository journeyRepository) {
//		return (args) -> {
//			Stream.of(new Journey("Madrid", "Journey pour Madrid"), 
//					  new Journey("Paris", "Un peu long"), 
//					  new Journey("New York", "L'avion est pas top"),
//					  new Journey("Sao-Paulo", "Luxueux"), 
//					  new Journey("London", "Du thé vous sera proposé"))
//					.forEach((v) -> {
//						journeyRepository.save(v);
//					});
//
//		};
//	}


}
