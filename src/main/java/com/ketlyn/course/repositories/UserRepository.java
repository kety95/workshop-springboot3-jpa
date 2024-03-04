package com.ketlyn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketlyn.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
