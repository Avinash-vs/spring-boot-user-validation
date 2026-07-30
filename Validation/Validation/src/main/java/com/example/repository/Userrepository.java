package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;

public interface Userrepository extends JpaRepository<User, Integer>{

}
