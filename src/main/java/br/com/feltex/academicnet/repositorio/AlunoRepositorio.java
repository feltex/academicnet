package br.com.feltex.academicnet.repositorio;

import br.com.feltex.academicnet.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{
}
