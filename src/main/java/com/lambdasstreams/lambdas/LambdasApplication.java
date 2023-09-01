package com.lambdasstreams.lambdas;

import com.lambdasstreams.lambdas.interfaces.DataService;
import com.lambdasstreams.lambdas.interfaces.MongoDB;
import com.lambdasstreams.lambdas.interfaces.PostgresDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdasApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdasApplication.class, args);
		System.out.println("Hello World");

		DataService mongo = new MongoDB();
		DataService postgres = new PostgresDB();

		System.out.println(mongo.getById(10L));
		System.out.println(postgres.getById(30L));
	}

}
