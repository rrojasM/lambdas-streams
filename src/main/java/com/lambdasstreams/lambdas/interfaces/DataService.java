package com.lambdasstreams.lambdas.interfaces;

import java.util.List;

public interface DataService<T> {
    T getById(Long id);
    List<T> getAllRecords();

}
