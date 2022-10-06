package com.spring.projetospringbootdjenole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.projetospringbootdjenole.entity.Aluno;
import com.spring.projetospringbootdjenole.entity.Turma;
import com.spring.projetospringbootdjenole.service.TurmaService;

public class TurmaController {
     
    @Autowired
    private TurmaService turmaService;

    @GetMapping("listaTurmas")
    public ModelAndView listarTodasTurmas(){
        ModelAndView mv = new ModelAndView("turma/listaTurmasPage");
        mv.addObject("turmas", turmaService.buscarTodasTurmas());
        return mv;
    }
    
    
    @GetMapping("/cadastrarTurma")
    public ModelAndView cadastrarTurma() {
    	ModelAndView mv = new ModelAndView("turma/cadastrarTurma");
    	mv.addObject("turma", new Turma());
    	
    	return mv;
    }
}
