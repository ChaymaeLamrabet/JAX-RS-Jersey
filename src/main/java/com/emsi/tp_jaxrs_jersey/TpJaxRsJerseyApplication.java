package com.emsi.tp_jaxrs_jersey;

import com.emsi.tp_jaxrs_jersey.entity.Compte;
import com.emsi.tp_jaxrs_jersey.enumeration.Typecompte;
import com.emsi.tp_jaxrs_jersey.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TpJaxRsJerseyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpJaxRsJerseyApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			compteRepository.save(new Compte(null,Math.random()*9000,new Date(), Typecompte.COURANT));
			compteRepository.save(new Compte(null,Math.random()*9000,new Date(), Typecompte.EPARGNE));
			compteRepository.save(new Compte(null,Math.random()*9000,new Date(), Typecompte.EPARGNE));
			compteRepository.findAll().forEach(compte -> {
				System.out.println(compte);
			});

		};
	}
}
