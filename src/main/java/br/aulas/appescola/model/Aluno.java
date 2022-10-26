package br.aulas.appescola.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("ALUNO")
public class Aluno extends Pessoa{

	@Column(length = 10, unique = true)
	private String matricula;
	
	@Enumerated(EnumType.STRING)
	private StatusAluno statusAluno;

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the statusAluno
	 */
	public StatusAluno getStatusAluno() {
		return statusAluno;
	}

	/**
	 * @param statusAluno the statusAluno to set
	 */
	public void setStatusAluno(StatusAluno statusAluno) {
		this.statusAluno = statusAluno;
	}

	
	
}
