package com.example.nutrimarket.service;

import com.example.nutrimarket.DTO.ProductDTO;
import com.example.nutrimarket.model.Product;
import com.example.nutrimarket.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Transactional(rollbackOn = Exception.class)
@RequiredArgsConstructor
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findByProductId(id);
    }

    public List<Product> getProductByCategory(String category) {
        return productRepository.findByProductCategory(category);
    }

    public List<Product> getProductByName(String name) {
        return productRepository.findByProductName(name);
    }

    public void deleteProductById(int id) {
        productRepository.deleteByProductId(id);
    }

    public Product createProduct(ProductDTO productDTO) {
        Product product = new Product();

        if (productDTO != null) {
            product.setProductName(productDTO.getProductName());
            product.setProductCategory(productDTO.getProductCategory());
            product.setProductDescription(productDTO.getProductDescription());
            product.setProductStock(productDTO.getProductStock());
            product.setProductPrice(productDTO.getProductPrice());
        }

        return productRepository.save(product);
    }

    public Product updateProduct(int id, ProductDTO productDTO) {
        Product product = productRepository.findByProductId(id);

        if (productDTO != null) {
            product.setProductName(productDTO.getProductName());
            product.setProductCategory(productDTO.getProductCategory());
            product.setProductDescription(productDTO.getProductDescription());
            product.setProductStock(productDTO.getProductStock());
            product.setProductPrice(productDTO.getProductPrice());
        }

        return productRepository.save(product);
    }
}
