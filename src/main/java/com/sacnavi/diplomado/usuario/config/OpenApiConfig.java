package com.sacnavi.diplomado.usuario.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
			version = "v1",
			title = "Pixup Usuario Microservice Endpoints", 
			description = "Definición de los Endpoints de "
					+ "Usuario Service para el sistema Pixup", 
			contact = @Contact(
				name = "Ivan Castillo", 
				url = "https://mx.linkedin.com/in/sacnavi", 
			email = "sacnavi@outlook.com")))
public class OpenApiConfig {

}