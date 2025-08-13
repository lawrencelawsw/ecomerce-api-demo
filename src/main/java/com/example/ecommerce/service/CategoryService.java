package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Category;
import com.example.ecommerce.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category create(Category category) {
		return categoryRepository.save(category);
	}
	
	public Category get(Long id) {
		return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
	}
	
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}
}
