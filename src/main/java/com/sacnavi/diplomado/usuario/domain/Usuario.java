package com.sacnavi.diplomado.usuario.domain;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="usuarios")
public class Usuario {
	
	@Id
	private String id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String password;
	private String email;
	private String rfc;
	private Collection<Domicilio> domicilios = new LinkedHashSet<>();

}