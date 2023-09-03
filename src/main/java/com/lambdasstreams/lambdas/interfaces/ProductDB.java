package com.lambdasstreams.lambdas.interfaces;

import com.lambdasstreams.lambdas.Product;

import java.util.List;

public class ProductDB implements DataService<Product>{
    @Override
    public Product getById(Long id) {
        Product p = new Product();
        p.setId(id);
        p.setName("Papas Fritas");
        p.setPrice(35.0);
        return p;
    }

    @Override
    public List<Product> getAllRecords() {
        return null;
    }
}
