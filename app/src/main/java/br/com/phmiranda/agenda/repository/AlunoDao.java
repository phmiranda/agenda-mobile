package br.com.phmiranda.agenda.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.phmiranda.agenda.entity.Aluno;

public class AlunoDao {
    private final static List<Aluno> alunos = new ArrayList<>();

    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
