package com.TeluskoFirst.learning;

import com.TeluskoFirst.learning.model.Alien;
import com.TeluskoFirst.learning.repository.AlienRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {

		ApplicationContext context = run(LearningApplication.class, args);

		Alien alien =    context.getBean(Alien.class);
		alien.setId(101);
		alien.setName("Sahil");
		alien.setTech("JAVA");

		AlienRepository alienRepository = context.getBean(AlienRepository.class);
		alienRepository.save(alien);
	}

}
