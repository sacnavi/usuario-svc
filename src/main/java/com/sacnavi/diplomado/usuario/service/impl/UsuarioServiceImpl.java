package com.sacnavi.diplomado.usuario.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacnavi.diplomado.usuario.domain.Domicilio;
import com.sacnavi.diplomado.usuario.domain.Usuario;
import com.sacnavi.diplomado.usuario.domain.UsuarioAlreadyExistsException;
import com.sacnavi.diplomado.usuario.repository.UsuarioRepository;
import com.sacnavi.diplomado.usuario.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private static final Logger LOG = 
			LoggerFactory.getLogger(UsuarioServiceImpl.class);

	@Override
	public Usuario registrarUsuario(Usuario usuario, Domicilio domicilio) {
		// validacion usuario existente
		Optional<Usuario> usuarioExistente = 
				usuarioRepository.findByEmail(usuario.getEmail());
		if (usuarioExistente.isPresent()) {
			throw new UsuarioAlreadyExistsException(usuario.getEmail());
		}
		
		// guardar usuario
		usuario.getDomicilios().add(domicilio);
		usuarioRepository.save(usuario);
		LOG.info("Usuario Registrado: " + usuario);
		
		return usuario;
	}

}