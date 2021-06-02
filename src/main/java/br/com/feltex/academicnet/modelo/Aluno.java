package br.com.feltex.academicnet.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Aluno{

    @Id
    private Long matricula;
    private String nome;
    private String telefone;
    private String email;
    private Instant dataCadastro;

}
