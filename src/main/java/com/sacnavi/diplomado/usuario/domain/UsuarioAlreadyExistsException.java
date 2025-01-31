package com.sacnavi.diplomado.usuario.domain;

public class UsuarioAlreadyExistsException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public UsuarioAlreadyExistsException(String email) {
		super("Ya existe un usuario registrado con email: " + email);
	}

}