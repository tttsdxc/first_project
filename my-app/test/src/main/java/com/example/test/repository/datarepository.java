package com.example.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.model.UserName;


public interface datarepository extends JpaRepository<UserName, String> {
    @Query(value = "SELECT * FROM users", nativeQuery = true)
    List<UserName> findAllUsersNative();

}
