package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

}
