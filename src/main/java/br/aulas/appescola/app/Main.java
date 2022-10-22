package br.aulas.appescola.app;

import br.aulas.appescola.dao.CursoDao;
import br.aulas.appescola.dao.ProfessorDao;
import br.aulas.appescola.model.Curso;
import br.aulas.appescola.model.Endereco;
import br.aulas.appescola.model.Modalidade;
import br.aulas.appescola.model.Professor;

public class Main {

	public static void main(String[] args) {
	
		Professor professor1 = new Professor();
		professor1.setNome("Mauricio");
		professor1.setEmail("mauricio@email.com.br");
		professor1.setEndereco(new Endereco("rua", "123", "bairro"));
		
		ProfessorDao profRepo = new ProfessorDao();
		profRepo.save(professor1);
		
		Curso curso1 = new Curso();
		curso1.setNome("Computacao");
		curso1.setCargaHoraria(2500);
		curso1.setModalidade(Modalidade.PRESENCIAL);
		curso1.setPreco(1000);
		curso1.setProfessor(profRepo.findById(Professor.class, 1L).get());
		
		CursoDao cursorepo = new CursoDao();
		cursorepo.save(curso1);
		
	}

}
