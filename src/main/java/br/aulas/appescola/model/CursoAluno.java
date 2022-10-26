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

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	/**
	 * @return the nota
	 */
	public double getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}

	/**
	 * @return the frequencia
	 */
	public int getFrequencia() {
		return frequencia;
	}

	/**
	 * @param frequencia the frequencia to set
	 */
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	/**
	 * @return the situacao
	 */
	public SituacaoAlunoTurma getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(SituacaoAlunoTurma situacao) {
		this.situacao = situacao;
	}

	/**
	 * @return the dataInicio
	 */
	public LocalDate getDataInicio() {
		return dataInicio;
	}

	/**
	 * @param dataInicio the dataInicio to set
	 */
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	/**
	 * @return the dataTermino
	 */
	public LocalDate getDataTermino() {
		return dataTermino;
	}

	/**
	 * @param dataTermino the dataTermino to set
	 */
	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}

}
