package com.spring.projetospringbootdjenole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.projetospringbootdjenole.entity.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer>{
    
}
