package com.sacnavi.diplomado.usuario.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sacnavi.diplomado.usuario.domain.Usuario;
import com.sacnavi.diplomado.usuario.dto.RegistroUsuarioRequest;
import com.sacnavi.diplomado.usuario.service.UsuarioService;

@RestController
public class UsuarioController implements UsuarioApi {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public Usuario registrarUsuario(
			RegistroUsuarioRequest request) {
		return usuarioService.registrarUsuario(
			request.getUsuario(), request.getDomicilio());
	}

}