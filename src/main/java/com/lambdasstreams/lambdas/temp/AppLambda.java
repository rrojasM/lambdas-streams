package com.lambdasstreams.lambdas.temp;

import java.util.List;

public class AppLambda {
    public static void main(String[] args) {
        
        List<String > countries = List.of("MEXICO", "COLOMBIA","PARAGUAY","BRAZIL","CHILE","PERÚ","URUGUAY","ARGENTINA");

        for (String c: countries){
            System.out.println(c);
        }

        System.out.println("\nFOR EACH WITH EXPRESSION LAMBDAS \n");
        countries.forEach(c -> System.out.println(c.toLowerCase()));
    }
}
