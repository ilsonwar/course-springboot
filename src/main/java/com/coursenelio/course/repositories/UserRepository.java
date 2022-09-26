package com.coursenelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursenelio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
