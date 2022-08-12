package br.com.cruzvita.cadastroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cruzvita.cadastroapi.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, String>{

}
