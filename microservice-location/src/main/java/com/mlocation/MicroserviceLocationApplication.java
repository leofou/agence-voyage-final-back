package com.mlocation;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mlocation.entities.Location;
import com.mlocation.enumeration.LocationType;
import com.mlocation.repositories.LocationRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceLocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceLocationApplication.class, args);
		
		
	}
	
	@Bean
	CommandLineRunner start(LocationRepository locationRepository) {
		return (args) -> {
			Stream.of(new Location(5151515, "Toulouse", LocationType.AIRPORT), 
					  new Location(98653, "Paris", LocationType.AIRPORT), 
					  new Location(11513, "Marseille", LocationType.SEAPORT),
					  new Location(49545, "Londres", LocationType.TRAINSTATION), 
					  new Location(39994, "Dubai", LocationType.AIRPORT))
					.forEach((v) -> {
						locationRepository.save(v);
					});

		};
	}


}
