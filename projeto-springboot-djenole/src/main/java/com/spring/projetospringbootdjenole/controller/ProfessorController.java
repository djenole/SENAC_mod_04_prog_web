package com.spring.projetospringbootdjenole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.projetospringbootdjenole.service.ProfessorService;

@Controller
@RequestMapping("professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping("listarProfessores")
    public ModelAndView listarTodosProfessores() {
        ModelAndView mv = new ModelAndView("professor/listaProfessoresPage");
        mv.addObject("professores", professorService.buscarTodosProfessores());
        return mv;
    }
    
}
