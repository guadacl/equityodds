package com.jdk.odds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.jdk.odds.domain")
public class EquityoddsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquityoddsApplication.class, args);
	}

}
