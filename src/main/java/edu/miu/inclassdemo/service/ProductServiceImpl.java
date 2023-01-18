package edu.miu.inclassdemo.service;

import edu.miu.inclassdemo.domain.Product;
import edu.miu.inclassdemo.domain.Review;
import edu.miu.inclassdemo.repo.ProductRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Product p) {
        productRepo.save(p);
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public void updateById(int id, Product p) {
       // productRepo.updateById(id, p);
    }

    @Override
    public List<Product> findAllPriceGreaterThan(int price) {
        return productRepo.findAllByPriceGreaterThan(price);
    }

    @Override
    public Review getReviewByProductId(int pId, int reviewId) {
        return null;
      //  return productRepo.getReviewByProductId(pId, reviewId);
    }
}
