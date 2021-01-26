package com.moperatingcompany;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.moperatingcompany.entities.OperatingCompany;
import com.moperatingcompany.repositories.OperatingCompanyRepository;


@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceOperatingcompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOperatingcompanyApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(OperatingCompanyRepository operatingCompanyRepository) {
		return (args) -> {
			Stream.of(new OperatingCompany("ABC", "National Company"), 
					  new OperatingCompany("DDD", "Internation Company"), 
					  new OperatingCompany("EEE", "Quality is the most important"),
					  new OperatingCompany("FFFFF", "Always be happy"), 
					  new OperatingCompany("GGGGGG", "Du thé vous sera proposé"))
					.forEach((o) -> {
						operatingCompanyRepository.save(o);
					});

		};
	}

}
