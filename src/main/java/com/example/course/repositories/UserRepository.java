package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;

// Repository responsável por fazer operações com a entidade USER
public interface UserRepository extends JpaRepository<User, Long>{

}
