package com.lambdasstreams.lambdas.interfaces;

import java.util.List;

public class PostgresDB implements DataService {
    @Override
    public String getById(Long id) {
        return "Getting data from PostgresDB: " + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hello World FROM Postgres");
    }
}
