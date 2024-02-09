package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Occupant;

@Repository
public interface OccupantRepository extends JpaRepository<Occupant, Integer> {

}
