package com.miranda.growappbackendpublic;

import com.miranda.growappbackendpublic.model.User;
import com.miranda.growappbackendpublic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrowappBackendPublicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GrowappBackendPublicApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository; //För att kunna spara en användare.

	@Override
	public void run(String... args) throws Exception {
/*		this.userRepository.save(new User("Anna", "Berg", "anna.berg@gmail.com")); //Sparar user till db
		this.userRepository.save(new User("Sam", "Nilsson", "sam@gmail.com"));
		this.userRepository.save(new User("Kalle", "Anka", "k.anka@gmail.com"));*/

	}
}
