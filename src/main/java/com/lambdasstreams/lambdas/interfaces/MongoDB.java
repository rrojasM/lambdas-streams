package com.lambdasstreams.lambdas.interfaces;

import java.util.List;

public class MongoDB implements DataService{
    @Override
    public String getById(Long id) {
        return "Getting data from MongoDB: " + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hello world");
    }
}
