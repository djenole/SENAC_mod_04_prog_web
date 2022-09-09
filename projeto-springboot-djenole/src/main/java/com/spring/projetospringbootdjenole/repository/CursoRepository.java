package com.spring.projetospringbootdjenole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.projetospringbootdjenole.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{
    
}
