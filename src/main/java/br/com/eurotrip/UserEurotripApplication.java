package br.com.eurotrip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserEurotripApplication implements CommandLineRunner {
	
	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(UserEurotripApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
	}

}
