package com.lambdasstreams.lambdas.interfaces;

import java.util.List;

public interface DataService {
    String getById(Long id);
    List<String> getAllRecords();

}
