package com.spring.projetospringbootdjenole.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Turma implements Serializable{
    private static final long serialVersionUID = 6631457942567742474L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String nome;

    @ManyToMany
    @JoinTable( 
    		name = "turma_curso", 
    		joinColumns = {@JoinColumn(name = "id_turma")}, 
    		inverseJoinColumns = {@JoinColumn(name="id_curso")})
    
    private List<Curso> cursos;
    
    
    
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
   public List<Curso> getCurso() {
	   return cursos;
   }
    public void setCurso(List<Curso> cursos) {
    	this.cursos = cursos;
    }
    
    
}
