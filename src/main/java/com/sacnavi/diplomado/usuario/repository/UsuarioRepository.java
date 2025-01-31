package com.sacnavi.diplomado.usuario.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sacnavi.diplomado.usuario.domain.Usuario;

public interface UsuarioRepository 
	extends MongoRepository<Usuario, String>{
	
	Optional<Usuario> findByEmail(String email);

}