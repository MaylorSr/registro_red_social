package com.triana.salesianos.registro_red_social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RegistroRedSocialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroRedSocialApplication.class, args);
	}

}
