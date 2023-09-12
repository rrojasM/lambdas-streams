package com.lambdasstreams.lambdas.iLambdas;

import com.lambdasstreams.lambdas.fundamentals.Employee;
import com.lambdasstreams.lambdas.fundamentals.Product;

public class AppGenericLambda {
    public static void main(String[] args) {

        Printer<String> printString = string -> System.out.println(string);
        Printer<Product> printProduct = product -> System.out.println(product);
        Printer<Employee> printEmployee = employee -> System.out.println(employee);

        printString.print("Hola Mundo!");

        Product myProduct = new Product();
        myProduct.setId(20000L);
        myProduct.setName("Rufino Rojas");
        myProduct.setPrice(1000.0);
        printProduct.print(myProduct);

        Employee e = new Employee();
        e.setDni("ROMR941121EE1");
        e.setName("Rufino Rojas Martinez");
        e.setSalary(35000.0);
        printEmployee.print(e);

    }
}
