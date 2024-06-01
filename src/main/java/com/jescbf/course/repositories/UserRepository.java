package com.jescbf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jescbf.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
