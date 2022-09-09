package com.spring.projetospringbootdjenole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.projetospringbootdjenole.service.CursoService;

@Controller
@RequestMapping("curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("listarCursos")
    public ModelAndView listarTodosCursos() {
        ModelAndView mv = new ModelAndView("curso/paginaListarCursos");
        mv.addObject("cursos", cursoService.buscarTodosCursos());
        return mv;
    }
    
}
