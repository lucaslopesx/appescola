package br.aulas.appescola.model;

public class Disciplina {

	private long id;
	private String nome;
	private Professor professor;
	private String ementa;

	public Disciplina(long id, String nome, Professor professor, String ementa) {
		this.id = id;
		this.nome = nome;
		this.professor = professor;
		this.ementa = ementa;
	}

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

	/**
	 * @return the ementa
	 */
	public String getEmenta() {
		return ementa;
	}

	/**
	 * @param ementa the ementa to set
	 */
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

}
