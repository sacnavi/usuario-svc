package com.sacnavi.diplomado.usuario.service;

import com.sacnavi.diplomado.usuario.domain.Domicilio;
import com.sacnavi.diplomado.usuario.domain.Usuario;

public interface UsuarioService {
	
	Usuario registrarUsuario(
		Usuario usuario, Domicilio domicilio);

}