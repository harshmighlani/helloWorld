package com.test.SampleHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleHelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("hello world");
		SpringApplication.run(SampleHelloWorldApplication.class, args);
	}

}
