package com.lambdasstreams.lambdas;

import com.lambdasstreams.lambdas.interfaces.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdasApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdasApplication.class, args);
		System.out.println("Hello World");

		//DataService mongo = new MongoDB();
		//DataService postgres = new PostgresDB();

		EmployeeDB employeeDB = new EmployeeDB();
		ProductDB productDB = new ProductDB();


		System.out.println(employeeDB.getById(12L).toString());
		System.out.println(productDB.getById(30L).toString());
	}

}
