package me.sourabh.springboot.controller;

import me.sourabh.springboot.domain.Product;
import me.sourabh.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Product controller
 *
 * Created by sourabhmahajan on 25/02/18.
 */
@RestController
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @RequestMapping("/createProduct")
    public Product create(String name, String description) {
        return service.createProduct(name, description);
    }
}
