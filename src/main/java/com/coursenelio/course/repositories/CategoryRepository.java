package com.coursenelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursenelio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
