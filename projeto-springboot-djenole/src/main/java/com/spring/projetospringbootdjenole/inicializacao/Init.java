package com.spring.projetospringbootdjenole.inicializacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.spring.projetospringbootdjenole.entity.Aluno;
import com.spring.projetospringbootdjenole.entity.Curso;
import com.spring.projetospringbootdjenole.entity.Professor;
import com.spring.projetospringbootdjenole.entity.Turma;
import com.spring.projetospringbootdjenole.service.AlunoService;
import com.spring.projetospringbootdjenole.service.CursoService;
import com.spring.projetospringbootdjenole.service.ProfessorService;
import com.spring.projetospringbootdjenole.service.TurmaService;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	AlunoService alunoService;
	
	@Autowired
	TurmaService turmaService;

	@Autowired
	CursoService cursoService;

	@Autowired
	ProfessorService professorService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		//ALUNO
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Djenole");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("abugu");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("barto");
		
		alunoService.salvar(aluno1);
		alunoService.salvar(aluno2);
		alunoService.salvar(aluno3);
		
		List<Aluno> listaAlunos = alunoService.buscarTodosAlunos();
		for (Aluno aluno : listaAlunos) {
			System.out.println(aluno.getNome());
		}
		
		Aluno aluno4 = alunoService.buscarPorId(1);
		System.out.println(aluno4.getNome());

		
		Aluno alunoAlterado = new Aluno();
		alunoAlterado.setId(1);
		alunoAlterado.setNome("Matheus");
		alunoService.salvarAlteracao(alunoAlterado);

		//TURMA
		Turma turma1 = new Turma();
		turma1.setNome("ADS2022");
		Turma turma2 = new Turma();
		turma2.setNome("Design de Interiores");
		Turma turma3 = new Turma();
		turma3.setNome("cabeleireiro");

		turmaService.salvar(turma1);
		turmaService.salvar(turma2);
		turmaService.salvar(turma3);

		List<Turma> listaTurmas = turmaService.buscarTodasTurmas();
		for (Turma turma : listaTurmas) {
			System.out.println(turma.getNome());
		}

		Turma turma = turmaService.buscarPorId(1);
		System.out.println(turma.getNome());

		Turma turmaAlterada = new Turma();
		turmaAlterada.setId(1);
		turmaAlterada.setNome("mudou o nome da turma; novo nome: analise e desenvolvimento de sistemas");
		turmaService.salvarAlteracao(turmaAlterada);


		//CURSO
		Curso curso1 = new Curso();
		curso1.setNome("JS");
		Curso curso2 = new Curso();
		curso2.setNome("C++");
		Curso curso3 = new Curso();
		curso3.setNome("Java");

		cursoService.salvar(curso1);
		cursoService.salvar(curso2);
		cursoService.salvar(curso3);

		List<Curso> listaCursos = cursoService.buscarTodosCursos();
		for (Curso curso : listaCursos) {
			System.out.println(curso.getNome());
		}

		Curso curso = cursoService.buscarPorId(1);
		System.out.println(curso.getNome());

		Curso cursoAlterado = new Curso();
		cursoAlterado.setId(1);
		cursoAlterado.setNome("Python");
		cursoService.salvarAlteracao(cursoAlterado);

		
		Professor professor1 = new Professor();
		professor1.setNome("Jesus");
		Professor professor2 = new Professor();
		professor2.setNome("Leonardo");
		Professor professor3 = new Professor();
		professor3.setNome("Bruno");

		professorService.salvar(professor1);
		professorService.salvar(professor2);
		professorService.salvar(professor3);

		List<Professor> listaProfessores = professorService.buscarTodosProfessores();
		for (Professor professor : listaProfessores) {
			System.out.println(professor.getNome());
		}

		Professor professor = professorService.buscarPorId(1);
		System.out.println(professor.getNome());

		Professor professorAlterado = new Professor();
		professorAlterado.setId(1);
		professorAlterado.setNome("Niele");
		professorService.salvarAlteracao(professorAlterado);
	}
	
}