package com.turkcell.product_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")

public class ProductsController {
    @GetMapping
    public String getProducts() {
        return "Products";
    }

    @GetMapping("{id}")
    public String getProductById(@PathVariable String id) {
        return "Product " + id;
    }

    @PostMapping
    public String createProduct() {
        return "Product created successfully";
    }

    @PutMapping
    public String updateProduct() {
        return "Product updated successfully";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "Product deleted successfully";
    }
}