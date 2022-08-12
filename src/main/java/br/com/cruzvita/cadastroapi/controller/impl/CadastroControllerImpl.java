package br.com.cruzvita.cadastroapi.controller.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cruzvita.cadastroapi.controller.CadastroController;
import br.com.cruzvita.cadastroapi.dto.CadastroDTO;
import br.com.cruzvita.cadastroapi.entity.Pessoa;
import br.com.cruzvita.cadastroapi.service.CadastroService;

@RestController
@RequestMapping("/pessoas")
public class CadastroControllerImpl implements CadastroController{

	@Autowired
	private CadastroService cadastroService;
	
	@Override
	@PostMapping("/cadastrar")
	public ResponseEntity<String> cadastrarPessoa(@RequestBody @Valid CadastroDTO cadastro) {
		return cadastroService.cadastrarPessoa(cadastro);
	}
	
	@Override
	@GetMapping("/buscarTodos")
	public ResponseEntity<List<Pessoa>> buscarTodos() {
		return cadastroService.buscarTodos();
	}

}
