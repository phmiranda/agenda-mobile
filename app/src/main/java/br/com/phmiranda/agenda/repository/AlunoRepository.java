package br.com.phmiranda.agenda.repository;

import br.com.phmiranda.agenda.domain.dto.AlunoDto;

public interface AlunoRepository {
    void index();

    void save(AlunoDto alunoDto);

    void update(AlunoDto alunoDto);

}
