package com.idtus;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; ++i) {
			System.out.println(new Greeting().getGreeting("" + i));
			Thread.sleep(500);
		}
		System.out.println("Done.");
	}

}
