package com.like.lion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.like.lion.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}