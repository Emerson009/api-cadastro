package br.com.cruzvita.cadastroapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoas")
public class Pessoa {

	@Id 
	private String identificador;
	private String nome;
	private String tipoId;
}
