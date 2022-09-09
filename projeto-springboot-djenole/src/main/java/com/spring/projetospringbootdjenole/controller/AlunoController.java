package com.spring.projetospringbootdjenole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.projetospringbootdjenole.service.AlunoService;

@Controller
@RequestMapping("aluno")

public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping("listarAlunos")
    public ModelAndView listarTodosAlunos() {
        ModelAndView mv = new ModelAndView("aluno/paginaListaAlunos");
        mv.addObject("alunos", service.buscarTodosAlunos());
        return mv;
    }



    
}
