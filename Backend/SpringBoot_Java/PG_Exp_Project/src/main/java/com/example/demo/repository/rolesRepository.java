package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.roles;
@Repository
public interface rolesRepository extends JpaRepository<roles, Integer> {

}
