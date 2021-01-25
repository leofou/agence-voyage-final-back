package com.mvoyageur;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mvoyageur.entities.Voyageur;
import com.mvoyageur.repositories.VoyageurRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceVoyageurApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceVoyageurApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(VoyageurRepository voyageurRepository) {
		return (args) -> {
			Stream.of(new Voyageur("dupond","chantal","le felin","ergserg"),
				      new Voyageur("francois","pierre","la doublette","lfje32djs"),
				      new Voyageur("depierix","alexandrin","le poete","1151zdzd15d15za1d"),
				      new Voyageur("cluze","noémie","la pieuvre","1115zedpute121212"),
				      new Voyageur("joch","alirov","l'enclume","e2n1c2u2l4é"))
			.forEach((v) -> {
				voyageurRepository.save(v);
			});
		};
	}

}
