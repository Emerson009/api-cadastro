package br.com.cruzvita.cadastroapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import br.com.cruzvita.cadastroapi.dto.CadastroDTO;
import br.com.cruzvita.cadastroapi.entity.Pessoa;

public interface CadastroController {

	public ResponseEntity<String> cadastrarPessoa(CadastroDTO cadastro);

	public ResponseEntity<List<Pessoa>> buscarTodos();
}
