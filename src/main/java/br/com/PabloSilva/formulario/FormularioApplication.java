package br.com.PabloSilva.formulario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FormularioApplication {

	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FormularioApplication.class, args);
	}

}