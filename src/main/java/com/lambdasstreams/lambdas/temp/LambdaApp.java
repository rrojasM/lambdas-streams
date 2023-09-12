package com.lambdasstreams.lambdas.temp;

import com.lambdasstreams.lambdas.ILambdas.Math;

public class LambdaApp {
    public static void main(String[] args) {
        Math substract = new Math() {
            @Override
            public Double excecute(Double a, Double b) {
                return a - b;
            }
        };

        //EXPRESIONES LAMBDAS
        Math multiply = (a,b) -> a * b;
        Math divide = (a,b) -> {
            System.out.println("START.....");
            return  a / b;
        };

        System.out.println( substract.excecute(5.0 , 5.0));
        System.out.println(multiply.excecute(10.0 , 10.0));
        System.out.println(divide.excecute(200.0, 10.0));
    }
}
