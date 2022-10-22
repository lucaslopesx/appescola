package br.aulas.appescola.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CursoAluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Curso curso;
	
	@ManyToOne
	private Aluno aluno;
	
	private double nota;
	private int frequencia;
	
	@Enumerated(EnumType.STRING)
	private SituacaoAlunoTurma situacao;
	
	@Column(name = "data_inicio", columnDefinition = "DATE")
	private LocalDate dataInicio;
	
	@Column(name = "data_termino", columnDefinition = "DATE")
	private LocalDate dataTermino;
	
}
