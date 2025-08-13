package com.example.ecommerce.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

//	List<Tag> findByName(String name);
}
