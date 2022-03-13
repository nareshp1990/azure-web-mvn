package com.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureWebMvnApplication {

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String sayHello(){
		return "Welcome to azure web app maven deploy";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureWebMvnApplication.class, args);
	}

}
