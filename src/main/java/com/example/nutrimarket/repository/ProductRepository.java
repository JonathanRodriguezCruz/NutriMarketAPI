package com.example.nutrimarket.repository;

import com.example.nutrimarket.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAll();

    Product findByProductId(int id);

    List<Product> findByProductCategory(String category);

    List<Product> findByProductName(String name);

    void deleteByProductId(int id);

    Product save(Product product);
}
