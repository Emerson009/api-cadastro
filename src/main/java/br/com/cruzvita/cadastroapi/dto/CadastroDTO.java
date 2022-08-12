package br.com.cruzvita.cadastroapi.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CadastroDTO {

	private String nome;
	
	@NotBlank(message = "Deve ser informado um identificador")
	private String identificador;
}
