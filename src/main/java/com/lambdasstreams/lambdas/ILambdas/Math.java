package com.lambdasstreams.lambdas.ILambdas;
@FunctionalInterface
public interface Math {
    Double excecute(Double a, Double b);


    default  Double sum(Double a, Double b) { return  a + b; }
}
