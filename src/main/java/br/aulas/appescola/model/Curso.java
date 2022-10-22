package br.aulas.appescola.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private Modalidade modalidade;
	
	@Column(precision = 6, scale = 2)
	private double preco;
	
	private int cargaHoraria;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Professor professor;

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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the modalidade
	 */
	public Modalidade getModalidade() {
		return modalidade;
	}

	/**
	 * @param modalidade the modalidade to set
	 */
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	/**
	 * @return the cargaHoraria
	 */
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	/**
	 * @param cargaHoraria the cargaHoraria to set
	 */
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	/**
	 * @return the professor
	 */
	public Professor getProfessor() {
		return professor;
	}

	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	
	
}
