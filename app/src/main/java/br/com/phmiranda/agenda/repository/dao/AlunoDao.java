package br.com.phmiranda.agenda.repository.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.phmiranda.agenda.domain.Aluno;
import br.com.phmiranda.agenda.repository.AlunoRepository;

public class AlunoDao implements AlunoRepository {
    @Override
    public void index() {
        
    }

    @Override
    public void save(Aluno aluno) {

    }

    @Override
    public void update(Aluno aluno) {

    }

    @Override
    public void delete(Aluno aluno) {

    }

    @Override
    public void findById(Aluno aluno) {

    }

    @Override
    public void findByName(Aluno aluno) {

    }

    @Override
    public void findByEmail(Aluno aluno) {

    }

    @Override
    public void findByContact(Aluno aluno) {

    }


    private final static List<Aluno> alunos = new ArrayList<>();

    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
