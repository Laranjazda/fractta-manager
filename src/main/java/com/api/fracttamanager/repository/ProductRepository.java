package com.api.fracttamanager.repository;

import com.api.fracttamanager.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductModel, String> {
}
