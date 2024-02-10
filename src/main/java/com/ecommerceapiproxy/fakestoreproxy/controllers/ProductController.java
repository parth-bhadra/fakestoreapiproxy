package com.ecommerceapiproxy.fakestoreproxy.controllers;
import com.ecommerceapiproxy.fakestoreproxy.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @GetMapping("/products")
    public String getProducts() {
        return "returning all products";
    }

    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable("id") String productId) {
        return "returning " + productId;
    }
    @PostMapping("/products")
    public String createProducts(@RequestBody ProductDto productDto) {
        return "created product";
    }

    @PutMapping("/products/{id}")
    public String patchProduct(@PathVariable("id") String productId, @RequestBody ProductDto productDto) {
        return "product updated " + productId;
    }
}
