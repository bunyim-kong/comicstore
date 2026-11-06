package com.example.comicstore.repository;

import com.example.comicstore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long>{   
}
