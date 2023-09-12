package com.lambdasstreams.lambdas;

import com.lambdasstreams.lambdas.interfaces.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LambdasApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdasApplication.class, args);
		System.out.println("LAMBDAS PROJECT SUCCESS...");

		//DataService mongo = new MongoDB();
		//DataService postgres = new PostgresDB();

		EmployeeDB employeeDB = new EmployeeDB();
		ProductDB productDB = new ProductDB();


		System.out.println(employeeDB.getById(12L).toString());
		System.out.println(productDB.getById(30L).toString());


		System.out.println(Product.class.getName());
		System.out.println(Employee.class.getName());

		//IMPLEMENTANDO CLASE ANONIMA
		DataService<String> dbAnonima = new DataService<String>() {
			@Override
			public String getById(Long id) {
				return null;
			}

			@Override
			public List<String> getAllRecords() {
				return null;
			}
		};

		System.out.println(dbAnonima.getClass().getName());

	}

}
