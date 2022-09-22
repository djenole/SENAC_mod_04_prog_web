package com.spring.projetospringbootdjenole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.projetospringbootdjenole.entity.Aluno;
import com.spring.projetospringbootdjenole.service.AlunoService;

@Controller
@RequestMapping("aluno")

public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping("/listarAlunos")
    public ModelAndView listarTodosAlunos() {
        ModelAndView mv = new ModelAndView("aluno/listaAlunosPage");
        mv.addObject("alunos", service.buscarTodosAlunos());
        return mv;
    }

    @GetMapping("/cadastrarAluno")
    public ModelAndView cadastrarAluno() {
    	ModelAndView mv = new ModelAndView("aluno/cadastrarAluno");
    	mv.addObject("aluno", new Aluno());
    	return mv;
    }
    
    @PostMapping("/salvar")
    public ModelAndView salvarAluno(Aluno aluno) {
    	service.salvar(aluno);
    	return listarTodosAlunos();
    }
    
    @GetMapping("/deletarPorId/{id}")
    public ModelAndView deletarPorId(@PathVariable("id") Integer id) {
    	service.deletarPorId(id);
    	return listarTodosAlunos();
    }
    

    @GetMapping("/alterarAluno/{id}")
    public ModelAndView alterarAluno(@PathVariable("id") Integer id) {
    	ModelAndView mv = new ModelAndView("aluno/alterarAluno");
    	mv.addObject("aluno", service.buscarPorId(id));
    	return mv;
    }
    
    @PostMapping("/salvarAlteracao")
    public ModelAndView salvar(Aluno aluno) {
    	service.salvar(aluno);
    	return listarTodosAlunos();
    }
    
    
    
}
