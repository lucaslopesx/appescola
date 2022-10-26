package br.aulas.appescola.app;

import java.time.LocalDate;

import br.aulas.appescola.dao.AlunoDao;
import br.aulas.appescola.dao.CursoAlunoDao;
import br.aulas.appescola.dao.CursoDao;
import br.aulas.appescola.dao.ProfessorDao;
import br.aulas.appescola.model.Aluno;
import br.aulas.appescola.model.Curso;
import br.aulas.appescola.model.CursoAluno;
import br.aulas.appescola.model.Endereco;
import br.aulas.appescola.model.Modalidade;
import br.aulas.appescola.model.Professor;
import br.aulas.appescola.model.StatusAluno;

public class Main {

	public static void main(String[] args) {
	
		Professor professor1 = new Professor();
		professor1.setNome("Mauricio");
		professor1.setEmail("mauricio2@email.com.br");
		professor1.setEndereco(new Endereco("rua", "123", "bairro"));
		
		ProfessorDao profRepo = new ProfessorDao();
		profRepo.save(professor1);

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Mauricio");
		aluno1.setEmail("mauricio3@email.com.br");
		aluno1.setEndereco(new Endereco("rua", "123", "bairro"));
		aluno1.setMatricula("123456789");
		aluno1.setStatusAluno(StatusAluno.ATIVO);
		
		AlunoDao alunodao = new AlunoDao();
		alunodao.save(aluno1);
		
		Curso curso1 = new Curso();
		curso1.setNome("Computacao");
		curso1.setCargaHoraria(2500);
		curso1.setModalidade(Modalidade.PRESENCIAL);
		curso1.setPreco(1000);
		//curso1.setProfessor(profRepo.findById(Professor.class, 1L).get());
		
		CursoDao cursorepo = new CursoDao();
		cursorepo.save(curso1);
		
		CursoAluno cursoAluno = new CursoAluno();
		cursoAluno.setCurso(cursorepo.findById(Curso.class, 1L).get());
		cursoAluno.setAluno(alunodao.findById(Aluno.class, 2L).get());
		cursoAluno.setDataInicio(LocalDate.now());
		
		CursoAlunoDao cursoAlunoDao = new CursoAlunoDao();
		cursoAlunoDao.save(cursoAluno);
		
		
	}

}
