package br.aulas.appescola.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("PROFESSOR")
public class Professor extends Pessoa {
	
	@Enumerated(EnumType.STRING)
	private Titulacao titulacao;

	/**
	 * @return the titulacao
	 */
	public Titulacao getTitulacao() {
		return titulacao;
	}

	/**
	 * @param titulacao the titulacao to set
	 */
	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}

	

}
