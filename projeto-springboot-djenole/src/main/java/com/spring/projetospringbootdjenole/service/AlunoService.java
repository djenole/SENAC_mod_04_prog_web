package com.spring.projetospringbootdjenole.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.projetospringbootdjenole.entity.Aluno;
import com.spring.projetospringbootdjenole.repository.AlunoRepository;



@Service
public class AlunoService {

    @Autowired
    AlunoRepository repo;
    
    public List<Aluno> buscarTodosAlunos() {
        return repo.findAll();
    }

    public Aluno salvar(Aluno aluno) {
        return repo.save(aluno);
    }
    
    public Aluno cadastrarAluno(Aluno aluno) {
        return repo.save(aluno);
    }

    public Aluno buscarPorId(Integer id) throws ObjectNotFoundException {
        Optional<Aluno> aluno = repo.findById(id);
        return aluno.orElseThrow(() -> new ObjectNotFoundException(1L, "aluno não encontrado"));
    }

    public void deletarPorId(Integer id) {
        repo.deleteById(id);
    }

    public Aluno salvarAlteracao(Aluno alunoAlterado) {
        Aluno aluno = buscarPorId(alunoAlterado.getId());
        aluno.setNome(alunoAlterado.getNome());
        return salvar(aluno);
    }
    

    
 
}
