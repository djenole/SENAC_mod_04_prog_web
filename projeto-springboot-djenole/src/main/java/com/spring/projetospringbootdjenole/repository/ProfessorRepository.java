package com.spring.projetospringbootdjenole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.projetospringbootdjenole.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{
    
}
