package com.api.fracttamanager.service;

import com.api.fracttamanager.model.ProductModel;
import com.api.fracttamanager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<ProductModel> createProduct(List<ProductModel> product) {
        return productRepository.saveAll (product);
    }

    public Optional<ProductModel> findById(String id) {
        return productRepository.findById (id);
    }

    public List<ProductModel> findAllWorkplaces(){
        return productRepository.findAll ();
    }

}
