package me.sourabh.springboot.service;

import me.sourabh.springboot.dao.ProductRepository;
import me.sourabh.springboot.domain.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service
 *
 * Created by sourabhmahajan on 25/02/18.
 */
@Service
public class ProductService {

    private final ProductRepository repository;
    private final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product createProduct(String name, String description) {
        final Product newProduct = repository.insert(new Product(name, description));
        logger.info("New product created with id: {}", newProduct.getId());
        return newProduct;
    }
}
