package com.lambdasstreams.lambdas.fundamentals;

import java.util.List;
import java.util.UUID;

public class EmployeeDB implements DataService<Employee>{
    @Override
    public Employee getById(Long id) {
        Employee em = new Employee();
        em.setDni(UUID.randomUUID().toString());
        em.setName("Rufino Rojas");
        em.setSalary(3500.0);
        return em;
    }

    @Override
    public List<Employee> getAllRecords() {
        return null;
    }
}
