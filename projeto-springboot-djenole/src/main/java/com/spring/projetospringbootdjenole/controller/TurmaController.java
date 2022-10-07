package com.spring.projetospringbootdjenole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.projetospringbootdjenole.entity.Aluno;
import com.spring.projetospringbootdjenole.entity.Turma;
import com.spring.projetospringbootdjenole.service.CursoService;
import com.spring.projetospringbootdjenole.service.TurmaService;


@Controller
@RequestMapping("turma")
public class TurmaController {
     
    @Autowired
    private TurmaService turmaService;
    
    @Autowired
    private CursoService cursoService;

    @GetMapping("/listaTurmas")
    public ModelAndView listarTodasTurmas(){
        ModelAndView mv = new ModelAndView("turma/listaTurmaPage");
        mv.addObject("turmas", turmaService.buscarTodasTurmas());
        return mv;
    }
    
    
    @GetMapping("/cadastrarTurma")
    public ModelAndView cadastrarTurma() {
    	ModelAndView mv = new ModelAndView("turma/cadastrarTurma");
    	mv.addObject("turma", new Turma());
    	mv.addObject("listaCurso", cursoService.buscarTodosCursos());
    	return mv;
    }
}
