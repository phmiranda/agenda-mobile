package br.com.phmiranda.agenda.repository;

import br.com.phmiranda.agenda.domain.Aluno;
import br.com.phmiranda.agenda.domain.dto.AlunoDto;

public interface AlunoRepository {
    void index();

    void save(Aluno aluno);

    void update(Aluno aluno);

    void delete(Aluno aluno);

    void findById(Aluno aluno);

    void findByName(Aluno aluno);

    void findByEmail(Aluno aluno);

    void findByContact(Aluno aluno);
}
