package com.lambdasstreams.lambdas.iLambdas;

@FunctionalInterface
public interface Printer<T> {

    void print(T toPrint);
}
