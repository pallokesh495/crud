package com.lokesh495.Crud.repository;

import com.lokesh495.Crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

