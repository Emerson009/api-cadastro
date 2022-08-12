package br.com.cruzvita.cadastroapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication()
@ComponentScan({"br.com.cruzvita.cadastroapi"})
@EntityScan(basePackages = "br.com.cruzvita.cadastroapi.entity")
public class CadastroApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroApiApplication.class, args);
	}

}
