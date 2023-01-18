package edu.miu.inclassdemo.controller;

import edu.miu.inclassdemo.domain.Product;
import edu.miu.inclassdemo.domain.Review;
import edu.miu.inclassdemo.service.ProductService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@NoArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findALl() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable int id) {
        return productService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Product product) {
        productService.save(product);
    }

    @GetMapping("/{pId}/review/{id}")
    public Review findById(@PathVariable int pId, @PathVariable int id) {
        return productService.getReviewByProductId(pId, id);
    }
}
