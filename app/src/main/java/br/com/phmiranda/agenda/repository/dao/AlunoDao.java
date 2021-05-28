package br.com.phmiranda.agenda.repository.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.phmiranda.agenda.domain.Aluno;
import br.com.phmiranda.agenda.domain.dto.AlunoDto;
import br.com.phmiranda.agenda.repository.AlunoRepository;

public class AlunoDao implements AlunoRepository {
    @Override
    public void index() {

    }

    @Override
    public void save(AlunoDto alunoDto) {

    }

    @Override
    public void update(AlunoDto alunoDto) {
        
    }

    private final static List<Aluno> alunos = new ArrayList<>();

    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
