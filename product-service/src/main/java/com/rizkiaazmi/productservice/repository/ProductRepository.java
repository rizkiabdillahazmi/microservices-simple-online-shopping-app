package com.rizkiaazmi.productservice.repository;

import com.rizkiaazmi.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Rizki Abdillah Azmi on 07-Feb-23
 */
public interface ProductRepository extends MongoRepository<Product, String> {
}
