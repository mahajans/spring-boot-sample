package me.sourabh.springboot.dao;

import me.sourabh.springboot.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class for product persistence
 *
 * Created by sourabhmahajan on 25/02/18.
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {
}
