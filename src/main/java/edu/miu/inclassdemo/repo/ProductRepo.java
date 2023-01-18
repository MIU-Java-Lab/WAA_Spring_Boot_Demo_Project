package edu.miu.inclassdemo.repo;

import edu.miu.inclassdemo.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Integer> {

    List<Product> findAll();
    List<Product> findAllByPriceGreaterThan(int price);
}

