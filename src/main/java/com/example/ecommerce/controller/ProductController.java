package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/api/products/create")
	public Product createProduct(@RequestBody Product product, @RequestParam Long categoryId, @RequestParam List<Long> tagIds) {
		return productService.createProduct(product, categoryId, tagIds);
	}
	
	@PostMapping("/api/products")
	//localhost:8080/api/products/category/{id}
	public Product addProduct(@RequestBody Product product, @RequestParam Long categoryId, @RequestParam List<Long> tagIds) {
		return productService.createProduct(product, categoryId, tagIds);
	}
	
//	@PostMapping("/api/products/add")
//	public Product addProduct(@RequestBody Product product) {
//		return productService.createProduct(product);
//	}
	
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	//Get By Id
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id) {
		return productService.getProductById(id);
	}
	
	//Update
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }
    
    //Delete
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
