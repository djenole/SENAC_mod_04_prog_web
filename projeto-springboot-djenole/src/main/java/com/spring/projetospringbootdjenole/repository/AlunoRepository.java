package com.spring.projetospringbootdjenole.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.spring.projetospringbootdjenole.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    

}
