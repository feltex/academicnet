package br.com.feltex.academicnet.beans;

import br.com.feltex.academicnet.modelo.Aluno;
import br.com.feltex.academicnet.repositorio.AlunoRepositorio;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "alunoMB")
@ViewScoped
public class AlunoMB {

    @Getter
    @Setter
    private List<Aluno> alunos = new ArrayList<>();

    @Getter
    @Setter
    private Aluno aluno;

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @PostConstruct
    public List<Aluno> listarTodos() {
        alunos = alunoRepositorio.findAll();
        return alunos;
    }

    public Integer getTamanhoDaLista() {
        return alunos.size();
    }

    public void setTamanhoDaLista(Integer size) {
        // Método criado para ser utilizado pelo primefaces
    }
}
