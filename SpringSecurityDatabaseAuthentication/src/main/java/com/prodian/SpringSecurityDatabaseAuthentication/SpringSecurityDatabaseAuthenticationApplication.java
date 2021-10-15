package com.prodian.SpringSecurityDatabaseAuthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.prodian.SpringSecurityDatabaseAuthentication.Entity.User;
import com.prodian.SpringSecurityDatabaseAuthentication.Repository.UserRepository;

@SpringBootApplication
public class SpringSecurityDatabaseAuthenticationApplication implements CommandLineRunner {
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDatabaseAuthenticationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 userRepository.save(new User("ramesh", bCryptPasswordEncoder.encode("ramesh")));
		
	}

}
