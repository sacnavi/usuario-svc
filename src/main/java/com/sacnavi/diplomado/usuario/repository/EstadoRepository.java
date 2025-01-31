package com.sacnavi.diplomado.usuario.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sacnavi.diplomado.usuario.domain.Estado;

public interface EstadoRepository 
	extends MongoRepository<Estado, String>{

}