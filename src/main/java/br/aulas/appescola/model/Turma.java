package br.aulas.appescola.model;

import java.time.LocalDate;
import java.util.List;

public class Turma {
	
	private long id;
	private String nomeDaTurma;
	private Curso curso;
	private List<CursoAluno> alunosNaTurma;
	private LocalDate dataInicio;
	private LocalDate dataTermino;

}
