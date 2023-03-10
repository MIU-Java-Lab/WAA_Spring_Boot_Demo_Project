package edu.miu.inclassdemo.service;

import edu.miu.inclassdemo.domain.Product;
import edu.miu.inclassdemo.domain.Review;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(int id);

    void save(Product p);

    void deleteById(int id);

    void updateById(int id, Product p);

    List<Product> findAllPriceGreaterThan(int price);

    Review getReviewByProductId(int pId, int reviewId);
}
